package FreeLancerSimulator;
import java.awt.*;
import javax.swing.*;

public class Frame{
    public static int width; // largura do frame
    public static int height; // altura do frame
    static JFrame frame = new JFrame("FreeLancer Simulator"); 
    static JTabbedPane tabs = new JTabbedPane();

    public static void tabs(){
        frame.add(tabs);
        CreateWindow();
        tabs.setBounds(0,0,505,550);
        tabs.addTab("Inicio", Game.panel );
        tabs.addTab("Loja", Loja.ljpanel);
        Loja.lojaPanel();
        

        

    }
    
    public static void CreateWindow(){ // simplesmente cirar a janela, nada demais
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(520, 580);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        width = frame.getWidth();
        height = frame.getHeight();
        
    }
    
    
  

}