package FreeLancerSimulator;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Load extends Thread{ 
    private JProgressBar barra;
    private JPanel panel; 
    private JButton button; 
    private int bug_fix = 0;


    Load(JProgressBar barra,JPanel panel,JButton button){ //define a barra do botao
        this.barra = barra;
        this.panel = panel;
        this.button = button;
    }


    public void run(){
        
        while(barra.getValue() < barra.getMaximum()){ // verifica se a barra já chegou em 100%
            try{
               Thread.sleep(10);
               barra.setValue(barra.getValue()+10);
               button.setEnabled(false);
               bug_fix = barra.getValue();
            } catch(InterruptedException e){
                e.printStackTrace();
            }   
            //(quando a barra chega em 100% ela pode executar algo da linha q vc colocar no lugar desse comentário)
        }
        button.setEnabled(true);
        panel.remove(barra);//para nao ter um monte de barras
        panel.repaint();
    }


}
