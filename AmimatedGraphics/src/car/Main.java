package car;

import java.awt.*;
import java.util.TimerTask;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Window viewWindow = new Window();
		Controller controller = new Controller(viewWindow);
		TimerTask moveCarTask = new TimerTask(){
			public void run(){
				viewWindow.moveCar();
			}
		};
		
		
//		java.util.Timer delayTimer = new java.util.Timer();
//		delayTimer.schedule(moveCarTask, 0, viewWindow.getMoveDelay());
		
		javax.swing.Timer delayTimer2 = new javax.swing.Timer(viewWindow.getMoveDelay2(),controller);
		delayTimer2.start();
		
		while(true){
			delayTimer2.setDelay(viewWindow.getMoveDelay2());
		}
		
	}

}
