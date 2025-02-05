package Y1S2.SC2002.tut.tut2;
import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Dice firstDice = new Dice();
        Dice secondDice = new Dice();

        Scanner sc = new Scanner(System.in);
        System.out.println("Press enter to roll the first dice");
        sc.nextLine();
        firstDice.setDiceValue();
        firstDice.printDiceValue();

        System.out.println("Press enter to roll the second dice");
        sc.nextLine();
        secondDice.setDiceValue();
        secondDice.printDiceValue();     
        
        System.out.println("Your total number is: " + (firstDice.getDiceValue() + secondDice.getDiceValue()));

    }
}
