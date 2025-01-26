package lab1;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer salary = Integer.valueOf(scanner.nextLine());
        Integer merit = Integer.valueOf(scanner.nextLine());

        if ((salary >= 500) && (salary <= 649)) {
            if (salary >= 600 && salary <= 649) {
                if (merit < 10) {
                    System.out.println("salary: $" + salary + ", merit : " + merit + " - Grade C");
                } else {
                    System.out.println("salary: $" + salary + ", merit : " + merit + " - Grade B");
                }
            } else {
                System.out.println("salary: $" + salary + ", merit : " + merit + " - Grade C");
            }
        } else if ((salary >= 600) && (salary <= 799)) {
            if (salary >= 700 && salary <= 799) {
                if (merit < 20) {
                    System.out.println("salary: $" + salary + ", merit : " + merit + " - Grade B");
                } else {
                    System.out.println("salary: $" + salary + ", merit : " + merit + " - Grade A");
                }
            } else {
                System.out.println("salary: $" + salary + ", merit : " + merit + " - Grade B");
            }
        } else if ((salary > 799) && (salary <= 899)) {
            System.out.println("salary: $" + salary + ", merit : " + merit + " - Grade A");
        }
    }
}
