import java.awt.*;
import javax.swing.*;


public class HangMan extends JPanel{
    
    private int angle;
    private boolean isAdding;

    public HangMan() {
        this.angle = 90;
        this.isAdding = true;

    }

    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.drawArc(100, 300, 160, 80, 0, 180);
        g.drawLine(180, 300, 180, 50);
        g.drawLine(180, 50, 350, 50);
        g.drawLine(350, 50, 350 + (int) Math.ceil(40 * Math.cos(Math.PI / 180 * angle)),
                50 + (int) Math.ceil(40 * Math.sin(Math.PI / 180 * angle)));
        g.drawOval(320 + (int) Math.ceil(40 * Math.cos((Math.PI / 180 * angle)) + Math.atan(30.0 / 40.0)),
                50 + (int) Math.ceil(40 * Math.sin((Math.PI / 180 * angle)) + Math.atan(30.0 / 40.0)), 60, 60);
        g.drawLine(350 + (int) Math.ceil(100 * Math.cos(Math.PI / 180 * angle)), 
                50 + (int) Math.ceil(100 * Math.sin(Math.PI / 180 * angle)), 
                350 + (int) Math.ceil(200 * Math.cos(Math.PI / 180 * angle)),
                50 + (int) Math.ceil(200 * Math.sin(Math.PI / 180 * angle)));
        g.drawLine(350 + (int) Math.ceil(Math.sqrt((150*150)+(30*30)) * Math.cos((Math.PI / 180 * angle)+Math.atan(30.0/150.0))), 
                50 + (int) Math.ceil(Math.sqrt((150*150)+(30*30)) * Math.sin((Math.PI / 180 * angle)+Math.atan(30.0/150.0))), 
                350 + (int) Math.ceil(Math.sqrt((150*150)+(30*30)) * Math.cos((Math.PI / 180 * angle)-Math.atan(30.0/150.0))),
                50 + (int) Math.ceil(Math.sqrt((150*150)+(30*30)) * Math.sin((Math.PI / 180 * angle)-Math.atan(30.0/150.0))));
        g.drawLine(350 + (int) Math.ceil(200 * Math.cos(Math.PI / 180 * angle)),
                50 + (int) Math.ceil(200 * Math.sin(Math.PI / 180 * angle)), 
                350 + (int) Math.ceil(Math.sqrt((250*250)+(50*50)) * Math.cos((Math.PI / 180 * angle)+Math.atan(50.0/250.0))),
                50 + (int) Math.ceil(Math.sqrt((250*250)+(50*50)) * Math.sin((Math.PI / 180 * angle)+Math.atan(50.0/250.0))));
        g.drawLine(350 + (int) Math.ceil(200 * Math.cos(Math.PI / 180 * angle)),
                50 + (int) Math.ceil(200 * Math.sin(Math.PI / 180 * angle)), 
                350 + (int) Math.ceil(Math.sqrt((250*250)+(50*50)) * Math.cos((Math.PI / 180 * angle)-Math.atan(50.0/250.0))),
                50 + (int) Math.ceil(Math.sqrt((250*250)+(50*50)) * Math.sin((Math.PI / 180 * angle)-Math.atan(50.0/250.0))));
        

    }

    public void animate() {
        
        if (isAdding) {
            angle = ((angle + 1) % 20) + 80;
            if (angle == 99) {
                isAdding = false;
            }
        } else {
            angle = ((angle - 1) % 20) + 80;
            if (angle == 80) {
                isAdding = true;
            }
        }
        repaint();
    }
    
}
