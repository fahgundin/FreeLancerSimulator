package FreeLancerSimulator;
import java.awt.*;
import javax.swing.*;

public class Frame{
    public static int width; // largura do frame
    public static int height; // altura do frame


    
    public static void CreateWindow(JPanel panel){ // simplesmente cirar a janela, nada demais
        JFrame frame = new JFrame("FreeLancer Simulator"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(520, 580);
        frame.setLayout(null);
        frame.add(panel);
        width = frame.getWidth();
        height = frame.getHeight();
    }
    
  

}