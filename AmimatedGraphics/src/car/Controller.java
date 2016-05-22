package car;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


public class Controller implements ActionListener{
	
	private Window viewWindow;
	private Timer timer;
	
	public Controller(Window viewWindow)
	{
		this.viewWindow = viewWindow;
		this.viewWindow.setController(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		viewWindow.moveCar();
	}
	
//	public void mousePressed(MouseEvent e)
//	{
//		viewWindow.setMoveCar(false);
//	}
//	
//	public void mouseReleased(MouseEvent e)
//	{
//		viewWindow.setMoveCar(true);
//	}

}
