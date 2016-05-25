package cliente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Carro {
	private int x;
	private int y;
	DataOutputStream toServerX;
	DataOutputStream toServerY;

	public Carro(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Carro() {
		this.x = 20;
		this.y = 20;
	}

	public void dibujar(Graphics g) {
		g.setColor(Color.BLUE);
		g.setColor(Color.BLUE);
		int[] coordenadasChasisX = { x, x, x + 10, x + 20, x + 30, x + 40, x + 50, x + 50 };
		int[] coordenadasChasisY = { y, y - 10, y - 10, y - 20, y - 20, y - 10, y - 10, y };
		Polygon chasis = new Polygon(coordenadasChasisX, coordenadasChasisY, coordenadasChasisX.length);
		g.fillPolygon(chasis);
		g.setColor(Color.BLACK);
		g.fillOval(x + 10, y, 10, 10);
		g.fillOval(x + 30, y, 10, 10);
		g.drawRect(x, y - 20, 50, 20);
	}

	public void keyPressed(KeyEvent e) throws IOException {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_DOWN:
			y += 10;
			break;
		case KeyEvent.VK_UP:
			y -= 10;
			break;
		case KeyEvent.VK_LEFT:
			x -= 10;
			break;
		case KeyEvent.VK_RIGHT:
			x += 10;
			break;

		}
	}

	public Rectangle obtenerRectangulo() {
		return new Rectangle(x, y - 20, 50, 20);
	}

	public void Server(int x, int y) throws IOException {

		System.out.println(x);
		System.out.println(y);
		try {
			Socket socket = new Socket("localhost", 8000);

			toServerX = new DataOutputStream(socket.getOutputStream());
			toServerY = new DataOutputStream(socket.getOutputStream());
			toServerX.writeInt(x);
			toServerX.flush();
			toServerY.writeInt(y);
			toServerY.flush();
		} catch (IOException ex) {
			System.out.println(ex);
		}
	}

}
