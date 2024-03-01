package FreeLancerSimulator;






import javax.swing.JPanel;

public class Game extends Frame{

    public static JPanel panel = new JPanel(); // painel
    public static Buttons[] actions = new Buttons[10]; // quantidade de ações, "programar hello world" e etc
    public static void main(String[] args) {
            panel.setSize(520,580); // o tamanho do painel
            panel.setLayout(null); // layout do painel(sempre em null )
            actions[0]= new Buttons("Coisar o Coiso", 1000, panel,10,20); // aqui são os botoes, pode ser de 0 a 9 mas da pra adicionar mais, se precisar, sempre coloque o y + 20 do botao anterior
            actions[1]= new Buttons("Coisar o outro Coiso", 5000, panel,20,50);
            actions[1]= new Buttons("Coisar o outro Coiso 2", 10000, panel,30,80);
            actions[1]= new Buttons("Coisar o outro Coiso 3", 15000, panel,40,110);
            CreateWindow(panel); // chamar o frame
            
        }

    }
    