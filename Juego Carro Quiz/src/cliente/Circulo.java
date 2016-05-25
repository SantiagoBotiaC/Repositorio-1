package cliente;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Circulo {
	private int x;
	private int y;
	private Image tileset;
	private int numImage;

	public Circulo(int x, int y) {
		this.x = x;
		this.y = y;
		this.numImage = 0;
		this.tileset = loadImage("FullCoins.png");
	}

	public Circulo() {
		this.x = 20;
		this.y = 20;
	}

	public void dibujar(Graphics g, JPanel panel) {
		g.setColor(Color.red);
		g.drawImage(tileset, x, y, x + 16, y + 16, 16 * this.numImage, 0, 16 * this.numImage + 16, 16, panel);

	}

	protected Image loadImage(String imageName) {
		ImageIcon ii = new ImageIcon(imageName);
		Image image = ii.getImage();
		return image;
	}

	public void mover() {
		if (this.numImage == 8) {
			this.numImage = 0;
		} else
			this.numImage++;
	}

	public Rectangle obtenerRectangulo() {
		return new Rectangle(x, y, 20, 20);
	}

}
