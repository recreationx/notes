package Y1S2.SC2002.tut.tut2;
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Circle circle = new Circle(0);
        System.out.println("====Circle Computaton====");
        System.out.println("|1. Create a new circle |");
        System.out.println("|2. Print Area |");
        System.out.println("|3. Print circumference |");
        System.out.println("|4. Quit |");
        System.out.println("=============================");
        do {
            System.out.println("Choose option (1-3): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the radius to compute the area and circumference");
                    circle.setRadius(sc.nextDouble());
                    System.out.println("A new circle is created.");
                    break;
                }
                case 2: {
                    circle.printArea();
                    break;
                }
                case 3: {
                    circle.printCircumference();
                    break;
                }
                
            }

        } while (choice < 4);
        System.out.println("Thank you!");

    }
}
