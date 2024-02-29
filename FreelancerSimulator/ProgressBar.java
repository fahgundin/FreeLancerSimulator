import java.awt.Color;
import javax.swing.*;


public class ProgressBar extends Game{
    JProgressBar barra = new JProgressBar();
    public ProgressBar(){
        
        barra.setBounds(40,40, 50,50);
        barra.setStringPainted(true);
        barra.setMaximum(100);
        barra.setForeground(new Color(0,255,0));
        
        
    } 
}
