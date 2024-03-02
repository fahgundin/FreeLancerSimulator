package FreeLancerSimulator;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

public class Loja extends Frame{
    
    static JPanel ljpanel = new JPanel();
    public static void lojaPanel(){
        
        ljpanel.setSize(320, 780);
        ljpanel.setLayout(null); 
        ljpanel.setBackground(Color.GRAY);
        ljpanel.setVisible(true);
        JScrollBar scroll = new JScrollBar();
        JButton button = new JButton("teste");
        button.setBounds(0,0,20,20);
        ljpanel.add(button);
        scroll.setBounds(285,0,20, 380);
        ljpanel.add(scroll);
        
        
    }
    
    
    
}
