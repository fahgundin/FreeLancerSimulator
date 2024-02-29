package FreeLancerSimulator;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons {
    public int val_max; // o valor de 100% do botao
    public String titulo; // o titulo do botao
    private JButton button = new JButton(); // o botao
    public Buttons(String titulo, int val_max, JPanel panel, int y){
        this.titulo = titulo; // declarando titulo
        this.val_max = val_max; //declarando o 100
        button = new JButton(this.titulo); // colocando o botao
        button.setBounds(20,y,200,20); // posição e dimensão do botão
        ButtonListener.buttonListener(this.button,this.val_max); // a função que facilita o ActionListener
        panel.add(button); // adicionando o botao na tela
    }


    
}
