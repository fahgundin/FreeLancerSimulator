

import javax.swing.JButton;
import javax.swing.JPanel;

public class Game extends Frame{

   
    public static void main(String[] args) {
            JPanel panel = new JPanel();
            JButton button = new JButton();
            panel.add(button);
            new ProgressBar(panel);
            CreateWindow(panel);
        }

    }
    