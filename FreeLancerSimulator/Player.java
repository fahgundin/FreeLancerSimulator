package FreeLancerSimulator;

public class Player {
    public String name;
    public int bit_coins;
    public int exp;

    public void addCoin(int value) {
        this.bit_coins = this.bit_coins + value;
        System.out.println(this.bit_coins);
    }

}