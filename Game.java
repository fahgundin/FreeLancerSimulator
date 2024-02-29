package FreeLancerSimulator;





import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Game extends Frame{

    public static JPanel panel = new JPanel(); // painel
    public static Buttons[] actions = new Buttons[10]; // quantidade de ações, "programar hello world" e etc
    public static ButtonListener bListener = new ButtonListener(); // função para facilitar o ActionListener: ButtonListener.buttonlistener(button);

    public static void main(String[] args) {
            panel.setSize(520,580); // o tamanho do painel
            panel.setLayout(null); // layout do painel(sempre em null )
            actions[0]= new Buttons("Coisar o Coiso", 1000, panel,20); // aqui são os botoes, pode ser de 0 a 9 mas da pra adicionar mais, se precisar, sempre coloque o y + 20 do botao anterior
            actions[1]= new Buttons("Coisar o outro Coiso", 10000, panel,50);
            CreateWindow(panel); // chamar o frame
            
        }

    }
    