package lab1;
import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice.toLowerCase()) {
            case "a": 
                System.out.println("Action movie fan");
                break;
            case "c":
                System.out.println("Comedy movie fan");
                break;
            case "d":
                System.out.println("Drama movie fan");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
