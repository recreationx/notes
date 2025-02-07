package lab4.surfaceArea;
import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of shapes:");
        int no = sc.nextInt();
        Shape[] shapes = new Shape[no];
        for (int i = 0; i < no; i++) {
            System.out.println("Choose the shape (1. Square, 2. Rectangle, 3. Circle, 4. Triangle):");
            int choice = sc.nextInt();
            double length, width;
            switch (choice) {
                case 1:
                    System.out.println("Enter the length of the sides:");
                    length = sc.nextDouble();
                    shapes[i] = new Square(length);
                    break;
                case 2:
                    System.out.println("Enter the length:");
                    length = sc.nextDouble();
                    System.out.println("Enter the width:");
                    width = sc.nextDouble();
                    shapes[i] = new Rectangle(width, length);
                    break;
                case 3:
                    System.out.println("Enter the radius:");
                    length = sc.nextDouble();
                    shapes[i] = new Circle(length);
                    break;
                case 4:
                    System.out.println("Enter the length:");
                    length = sc.nextDouble();
                    System.out.println("Enter the height:");
                    width = sc.nextDouble();
                    shapes[i] = new Triangle(length, width);
                    break;
                default:
                    break;
            }
        }

        
        double totalArea = 0;
        for (int i = 0; i < no; i++) {
            totalArea += shapes[i].calculateArea();
        }
        System.out.println("Area: " + totalArea);
    }
}