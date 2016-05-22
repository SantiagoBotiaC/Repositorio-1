import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;


public class View extends JPanel{
    
     private JFrame frame;
    private HangMan hangman;
    private TimerTask requestFocusedTask;
    private Timer focusedTimer;
    private int moveDelay = 100;
    private boolean moveHangman = true;
    private Controller controller;
    
    
    public View(){
        
        frame = new JFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(screenSize.width/2, screenSize.height/2);
		frame.setLocationRelativeTo(null);
		frame.setTitle("HangMan Animation");
		frame.setVisible(true);
		hangman = new HangMan();
		frame.add(hangman);
                this.frame.addKeyListener(new keyEvent());
                this.setFocusable(true);
                this.requestFocusInWindow();
                focusedTimer = new Timer();
                requestFocusedTask = new TimerTask(){
			public void run(){
				frame.requestFocusInWindow();
			}
		};
		focusedTimer.schedule(requestFocusedTask, 0,10);
                
    }
    
    private class keyEvent extends KeyAdapter {
        
        public void keyTyped(KeyEvent e){
            if (e.getKeyChar() == 'S' || e.getKeyChar() == 's'){
                setMoveHangman(false);
            }
            
            if (e.getKeyChar() == 'R' || e.getKeyChar() == 'r'){
                setMoveHangman(true);
            }
        }
        public void keyPressed(KeyEvent e){
            if (e.getKeyCode() == KeyEvent.VK_UP){
                moveDelay--;
                if(moveDelay <= 1){
                    moveDelay = 1;
                }
            }
             if (e.getKeyCode() == KeyEvent.VK_DOWN){
                moveDelay++;
                if(moveDelay >= 999999999){
                    moveDelay -= 1;
                }
                
            }
            
        }
          
    }

    public int getMoveDelay() {
        return moveDelay;
    }

    public boolean isMoveHangman() {
        return moveHangman;
    }

    public void setMoveHangman(boolean moveHangman) {
        this.moveHangman = moveHangman;
    }
    
    public void setController(Controller controller){
        this.controller=controller;
        
    }
    
    
    public void moveHangman(){
        if (moveHangman==true){
            hangman.animate();
        }
    }
    
}
