package FreeLancerSimulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Loja extends Frame{
    
    static JPanel ljpanel = new JPanel();
    public static void lojaPanel(){
        
        ljpanel.setLayout(new FlowLayout());
        ljpanel.setBackground(Color.GRAY);
        ljpanel.setVisible(true);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,700));
        JScrollPane pane = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setPreferredSize(new Dimension(490,500));
        ljpanel.add(pane);

        
    }
    
    
    
}
