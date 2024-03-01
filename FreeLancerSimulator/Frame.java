package FreeLancerSimulator;
import java.awt.*;
import javax.swing.*;

public class Frame{
    public static int width; // largura do frame
    public static int height; // altura do frame
    static JFrame frame = new JFrame("FreeLancer Simulator"); 

    
    public static void CreateWindow(JPanel panel){ // simplesmente cirar a janela, nada demais
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(520, 580);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        width = frame.getWidth();
        height = frame.getHeight();
    }
    
  

}