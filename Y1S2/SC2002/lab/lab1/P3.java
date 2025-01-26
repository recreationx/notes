package lab1;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("starting: ");
        Integer starting = Integer.valueOf(sc.nextLine());
        System.out.println("ending: ");
        Integer ending = Integer.valueOf(sc.nextLine());
        System.out.println("increment: ");
        Integer increment = Integer.valueOf(sc.nextLine());

        if (starting > ending) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println((String.format("%5s %5s", "US$", "S$")));
        System.out.println("-------------");
        for (int i = starting; i <= ending; i += increment) {
            System.out.println((String.format("%5d %5.2f", i, i * 1.82)));
        }

        System.out.println((String.format("%5s %5s", "US$", "S$")));
        System.out.println("-------------");

        Integer temp = starting;
        while (temp <= ending) {
            System.out.println((String.format("%5d %5.2f", temp, temp * 1.82)));
            temp += increment;
        }

        System.out.println((String.format("%5s %5s", "US$", "S$")));
        System.out.println("-------------");

        temp = starting;

        do {
            System.out.println((String.format("%5d %5.2f", temp, temp * 1.82)));
            temp += increment;
        } while (temp <= ending);
    }
}
