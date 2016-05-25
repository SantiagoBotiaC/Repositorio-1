package cliente;

import java.awt.BorderLayout;
import java.math.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.border.LineBorder;

public class Tablero extends JPanel implements ActionListener, KeyListener, Runnable {
	private Timer timer;
	private ArrayList<Circulo> circulo;
	private Carro personajePrincipal;
	private Carro personajeOponente;
	private int puntaje = 0;
	private int playerNum = 1;
	private boolean continueGame = true;
	DataInputStream fromServer;
	DataOutputStream toServer;

	public Tablero() {
		init();

	}

	public void init() {
		this.setFocusable(true);
		this.addKeyListener(this);
		this.personajePrincipal = new Carro((int) Math.floor(Math.random() * 1000.0),
				(int) Math.floor(Math.random() * 400.0));
		this.personajeOponente = new Carro((int) Math.floor(Math.random() * 1000.0),
				(int) Math.floor(Math.random() * 400.0));
		this.circulo = new ArrayList<Circulo>();
		this.circulo.add(new Circulo(100, 80));
		this.circulo.add(new Circulo(150, 220));
		this.circulo.add(new Circulo(400, 320));
		this.circulo.add(new Circulo(525, 350));
		this.circulo.add(new Circulo(250, 470));
		this.circulo.add(new Circulo(890, 50));
		this.circulo.add(new Circulo(1000, 500));
		this.circulo.add(new Circulo(700, 475));
		this.circulo.add(new Circulo(650, 150));
		this.timer = new Timer(30, this);
		this.timer.start();

		connectToServer();
	}

	private void connectToServer() {
		try {
			Socket socket = new Socket("localhost", 8000);

			fromServer = new DataInputStream(socket.getInputStream());

			toServer = new DataOutputStream(socket.getOutputStream());
		} catch (Exception ex) {
			System.err.println(ex);
		}

		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		try {
			playerNum = fromServer.readInt();

			if (playerNum == 1)
				fromServer.readInt();

			while (true) {
				toServer.writeInt(personajePrincipal.getX());
				toServer.writeInt(personajePrincipal.getY());
				int xOp = fromServer.readInt();
				int yOp = fromServer.readInt();
				personajeOponente.setX(xOp);
				personajeOponente.setY(yOp);
				toServer.writeBoolean(continueGame);
				if (continueGame == false) {
					break;
				}
			}

		} catch (Exception ex) {
		}

	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Circulo c : this.circulo)
			c.dibujar(g, this);

		this.personajePrincipal.dibujar(g);
		this.personajeOponente.dibujar(g);
		g.drawString("Jugador " + playerNum, 40, 40);
		g.drawString("Puntaje " + puntaje, 40, 60);
		if (continueGame == false) {
			if (puntaje > 4) {
				g.drawString("El juego ha terminado. Tu ganas", 40, 80);
			} else {
				g.drawString("El juego ha terminado. Tu pierdes", 40, 80);
			}

		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		validarColisiones();
		for (Circulo c : this.circulo)
			c.mover();
		repaint();

	}

	public void validarColisiones() {
		Rectangle recPersonaje = this.personajePrincipal.obtenerRectangulo();
		Rectangle recOponente = this.personajeOponente.obtenerRectangulo();
		ArrayList<Circulo> copia = (ArrayList<Circulo>) this.circulo.clone();
		for (Circulo c : circulo) {
			Rectangle RecCir = c.obtenerRectangulo();
			if (recPersonaje.intersects(RecCir)) {
				copia.remove(c);
				this.puntaje++;
			} else if (recOponente.intersects(RecCir)) {
				copia.remove(c);
			}
			this.circulo = copia;
		}
		if (copia.size() == 0)
			continueGame = false;

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		try {
			this.personajePrincipal.keyPressed(e);
		} catch (IOException ex) {
			Logger.getLogger(Tablero.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	public int getPlayerNum() {
		return playerNum;
	}

}
