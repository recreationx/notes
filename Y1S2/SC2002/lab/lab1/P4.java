package lab1;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer height = Integer.valueOf(sc.nextLine());

        if (height <= 0) {
            System.out.println("Invalid input");
            return;
        } 

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) { // If row is odd, start with AA
                    if (j % 2 == 0) { // For odd rows, if column is odd, print AA, else print BB
                        System.out.print("BB");
                    } else {
                        System.out.print("AA");
                    }
                } else { // If row is even, start with BB
                    if (j % 2 == 0) { // For even rows, if column is odd, print BB. else print AA
                        System.out.print("AA");
                    } else {
                        System.out.print("BB");
                    }
                }
            }
            System.out.println("");
        }
    }
    
}
