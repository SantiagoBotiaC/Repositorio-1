
import java.awt.*;
import java.awt.event.KeyAdapter;
import javax.swing.*;


public class Main {
    
    private static Timer timer;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View windowView = new View();
                Controller controller = new Controller(windowView);
                timer = new Timer(windowView.getMoveDelay(), controller);
                timer.start();
                
                while (true){
                    timer.setDelay(windowView.getMoveDelay());
                }
	}
    
}
