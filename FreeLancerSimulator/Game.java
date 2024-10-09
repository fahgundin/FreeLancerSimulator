package FreeLancerSimulator;

import javax.swing.JPanel;

public class Game extends Frame {

    public static JPanel panel = new JPanel(); // painel

    public static void main(String[] args) {
        Buttons[] actions = new Buttons[10]; // quantidade de ações, "programar hello world" e etc
        panel.setSize(520, 580); // o tamanho do painel
        panel.setLayout(null); // layout do painel(sempre em null )

        actions[0] = new Buttons("printar 'Hello World' ", 1000, panel, 10, 20); // aqui são os botoes, pode ser de 0 a
                                                                                 // 9 mas da
        // pra adicionar mais, se precisar, sempre
        // coloque o y + 20 do botao anterior

        actions[1] = new Buttons("criar site em html", 5000, panel, 20, 50);
        actions[2] = new Buttons("criar calculadora em java", 10000, panel, 30, 80);
        actions[3] = new Buttons("fazer programa de boteco", 15000, panel, 40, 110);
        actions[4] = new Buttons("fazer programa de boteco", 20000, panel, 50, 140);
        actions[5] = new Buttons("fazer programa de boteco", 15000, panel, 60, 170);
        actions[6] = new Buttons("fazer programa de boteco", 15000, panel, 70, 200);

        tabs();

    }

}
