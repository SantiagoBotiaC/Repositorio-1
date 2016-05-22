package car;

import java.awt.*;
import javax.swing.*;

public class Car extends JPanel{
	
	private int initialYPosition;
	private int x=0;
	private int dx;
	
	
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		initialYPosition = ((screenSize.height/2)/2);
		g.setColor(Color.BLUE);
		int[] coordenadasChasisX = {x,x,x+30,x+60,x+90,x+120,x+150,x+150};
		int[] coordenadasChasisY = {initialYPosition,initialYPosition-30,initialYPosition-30,initialYPosition-60,initialYPosition-60,initialYPosition-30,initialYPosition-30,initialYPosition};
		Polygon chasis = new Polygon(coordenadasChasisX,coordenadasChasisY,coordenadasChasisX.length);
		g.fillPolygon(chasis);
		g.setColor(Color.BLACK);
		g.fillOval(x+30, initialYPosition, 30, 30);
		g.fillOval(x+90, initialYPosition, 30, 30);
		
		dx = 1;
		x += dx;
		
		if(x+150 >= screenSize.getWidth()/2){
			x=0;
		}
		
	}	

}
