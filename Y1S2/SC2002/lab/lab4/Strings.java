import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] strings;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many strings do you want to sort?");
        int size = Integer.valueOf(sc.nextLine());
        strings = new String[size];
        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            strings[i] = sc.nextLine();
        }
        Sorting.insertionSort(strings);
        System.out.println("Your strings in sorted order:");
        for (int i = 0; i < size; i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println("");
    }
}
