import javax.swing.JProgressBar;

public class Load extends Frame{
    public void run(JProgressBar barra){
        while(barra.getValue() < 100){
            sleep(10);
        }

    }
    
}
