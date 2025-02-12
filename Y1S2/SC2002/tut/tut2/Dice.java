package Y1S2.SC2002.tut.tut2;
import java.util.Random;

public class Dice {
    private int valueOfDice;

    public void setDiceValue() {
        Random rand = new Random();
        this.valueOfDice = rand.nextInt(6) + 1;

    }

    public int getDiceValue() {
        return this.valueOfDice;
    }

    public void printDiceValue() {
        System.out.println("Current value is " + this.getDiceValue());
    }
    
}
