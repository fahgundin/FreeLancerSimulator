import java.awt.*;
import javax.swing.*;

public class Frame{
    


    
    public static void CreateWindow(JPanel panel){
        JFrame frame = new JFrame("FreeLancer Simulator"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(520, 580);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
    }
    
  

}