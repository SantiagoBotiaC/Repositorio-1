import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller implements ActionListener{
    private View windowView;
    
    public Controller(View windowView){
        this.windowView = windowView;
        this.windowView.setController(this);
    }
  
    @Override
    public void actionPerformed(ActionEvent ae) {
             windowView.moveHangman();
    }
}
