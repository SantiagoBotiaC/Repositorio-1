package cliente;

import java.awt.Dimension;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(new Dimension(1100, 600));
		frame.add(new Tablero());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
