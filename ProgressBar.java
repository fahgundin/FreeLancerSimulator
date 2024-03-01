package FreeLancerSimulator;

import java.awt.Color;
import javax.swing.*;


public class ProgressBar extends Frame{
    public JProgressBar barra = new JProgressBar();
    public ProgressBar(JPanel panel,int x,int y, int val_max,JButton button,int value){ // o painel, a posicao da barra e o valor 100% dela
        
        this.barra.setBounds(x,y, 70,20); // seta a posição da barra e as dimensões dela
        this.barra.setStringPainted(true); 
        this.barra.setValue(0); // valor incial da barra
        this.barra.setMaximum(val_max); // valor maximo da barra
        this.barra.setForeground(new Color(0,255,0)); // cor do loading da barra
        panel.add(this.barra); // adicionando a barra no painel
        new Load(barra, panel,button,value).start(); // executar o loading
        
    } 
}
