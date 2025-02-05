package Y1S2.SC2002.tut.tut3;
import java.util.Scanner;

public class VendingMachine {
    public VendingMachine() {}

    public double selectDrink() {
        Scanner sc = new Scanner(System.in);
        double[] priceArray = {3.00, 1.00, 5.00};
        System.out.println("=====Vending Machine=====");
        System.out.println("1. Buy Beer ($3.00)");
        System.out.println("2. Buy Coke ($1.00)");
        System.out.println("3. Buy Green Tea ($5.00)");
        System.out.println("=========================");
        System.out.println("Please enter selection");
        int selection = sc.nextInt();
        return priceArray[selection - 1];
    }

    public double insertCoins(double drinkCost) {
        double totalAmount = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert coins:");
        System.out.println("======Coins Input======");
        System.out.println("Enter 'Q' for ten cents input");
        System.out.println("Enter 'T' for twenty cents input");
        System.out.println("Enter 'F' for fifty cents input");
        System.out.println("Enter 'N' for a dollar input");
        System.out.println("=======================");
        String coin;
        do {
            coin = sc.nextLine();
            switch (coin) {
                case "Q":
                    totalAmount += 0.10;
                    break;
                case "T":
                    totalAmount += 0.20;
                    break;
                case "F":
                    totalAmount += 0.50;
                    break;
                case "N":
                    totalAmount += 1.00;
                    break;
            }   
            System.out.println("Coins inserted: " + totalAmount);

        } while (totalAmount < drinkCost);
        return totalAmount;
    }

    public void checkChange(double amount, double drinkCost) {
        System.out.println("Change: $ " + (amount - drinkCost));
        System.out.println("Please collect your drink");
        System.out.println("Thank you!");
    }

    public void printReceipt() {}
    
}
