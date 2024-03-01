package FreeLancerSimulator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JFrame;

public class Loja extends Frame{
    static JButton loja = new JButton("Loja");
    static JFrame lojaframe = new JFrame("Loja");
    static JPanel ljpanel = new JPanel();
    static JScrollPane scrollPane = new JScrollPane(ljpanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    public static void lojaPanel(){

        ljpanel.setSize(320,780); 
        ljpanel.setLayout(null); 
        ljpanel.setBackground(Color.GRAY);
        ljpanel.setVisible(true);
        
        
        
    }
    public static void createLojaWindow(){
        
        lojaframe.setVisible(true);
        lojaframe.setSize(320, 380);
        lojaframe.setLayout(null);
        lojaframe.setResizable(false);
        lojaframe.setLocationRelativeTo(null);
        lojaframe.add(ljpanel);
        lojaframe.setContentPane(ljpanel);
        scrollPane.setBounds(290, 0, 30, 780);
        ljpanel.add(scrollPane);
        
        
    }

   
  
    
    public static void lojaListener(JPanel panel){ // aqui vc ja entende
        loja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lojaPanel();
                createLojaWindow();
                loja.setEnabled(false);
                
            }
        });
    }
    public static void addLoja(JPanel panel){
        loja.setBounds(400,500,70,20);
        lojaListener(panel);
        lojaframe.addWindowListener(new WindowEventHandler());
        panel.add(loja);
    }
    
    
    
    
}
class WindowEventHandler extends WindowAdapter {
    public void windowClosing(WindowEvent evt) {
        Loja.loja.setEnabled(true);
    }
  }
