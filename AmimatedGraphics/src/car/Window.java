package car;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Window extends JPanel {

	private int screenWidth;
	private int screenHeight;
	private Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
	private java.util.Timer timer;
	private java.util.TimerTask moveCarTask;
	private java.util.TimerTask setFocusedTask;
	
	private JButton pause_resumeButton = new JButton("Press to pause/Release to resume");
	private Car car = new Car();
	private Controller controller;
	private boolean moveCar = true;
	private long moveDelay = 100;
	private int moveDelay2 = 100;

	public Window()
	{	
		JFrame frame = new JFrame("CarGame!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screenWidth = screenDimension.width;
		screenHeight = screenDimension.height;
		frame.setSize(screenWidth/2, screenHeight/2);
		frame.setLocation(screenWidth/2-frame.getWidth()/2,screenHeight/2-frame.getHeight()/2);
		frame.add(car, BorderLayout.CENTER);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(pause_resumeButton);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.setVisible(true);
		frame.addKeyListener(new keyEvent());
		this.setFocusable(true);
		this.requestFocusInWindow();
		frame.setFocusable(true);
		java.util.Timer timer = new java.util.Timer();
		timer.schedule(new java.util.TimerTask(){
			public void run(){
				frame.requestFocusInWindow();
			}
		}, 0, 10);
	}
	
	public void setController(Controller controller){
		this.controller = controller;
		this.pause_resumeButton.addMouseListener(new mouseEvent());
	}

	public boolean isMoveCar() {
		return moveCar;
	}

	public void setMoveCar(boolean moveCar) {
		this.moveCar = moveCar;
	}
	
	public void moveCar(){		
		if (moveCar ==true)
			car.repaint();
//		java.util.Timer timer = new java.util.Timer();
//		java.util.TimerTask moveCarTask = new java.util.TimerTask(){
//			public void run(){
//				carro.moveCar();
//			}
//		};
//		while(moverCarro)
//		{
//			timer.schedule(moveCarTask, 0, moveDelay);
//		}
		
//		if (moverCarro)
//		{
//			timer.schedule(moveCarTask, 0, moveDelay);
//		}
//		else
//			timer.cancel();
	}
	
	public long getMoveDelay() {
		return moveDelay;
	}

	public void setMoveDelay(long moveDelay) {
		if (moveDelay < 0)
			this.moveDelay = 0;
		else if (moveDelay > 100000000)
			this.moveDelay = 100000000;
		else	
			this.moveDelay = moveDelay;
	}
	
	 private class keyEvent extends KeyAdapter {

	        public void keyPressed(KeyEvent e) {

	        	if (e.getKeyCode() == KeyEvent.VK_UP) {
					setMoveDelay2(moveDelay2 - 1);
//					System.out.println("You just Pressed the UP arrow key");
		        }
				
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					setMoveDelay2(moveDelay2 + 1);
//					System.out.println("You just Pressed the DOWN arrow key");
		        }
	    }
	      
	}
	 
	 private class mouseEvent extends MouseAdapter {
		 
		 public void mousePressed(MouseEvent e)
			{
				setMoveCar(false);
			}
			
			public void mouseReleased(MouseEvent e)
			{
				setMoveCar(true);
			}

	 }

	public int getMoveDelay2() {
		return moveDelay2;
	}

	public void setMoveDelay2(int moveDelay2) {
		if (moveDelay2 <= 1)
			this.moveDelay2 = 1;
		else if (moveDelay2 >= 999999999)
			this.moveDelay2 = moveDelay2-1;
		else	
			this.moveDelay2 = moveDelay2;
	}

	 
}
