package FreeLancerSimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonListener {

    public static void buttonListener(JButton button, int val_max){ // aqui vc ja entende
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ProgressBar(Game.panel,button.getWidth()+50,button.getY(), val_max);
            }
        });
    }


}
