package Y1S2.SC2002.tut.tut1;
import java.util.Scanner;

public class Tutorial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integer elements to be sorted: ");
        int size = Integer.valueOf(sc.nextLine());

    
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter integer value for element no. " + (i+1) + ":");
            int input = Integer.valueOf(sc.nextLine());
            arr[i] = input;
        }

        int[] sortedArr = bubble(arr, size);
        for (int i = 0; i < size; i++) {
            System.out.println(sortedArr[i]);
        }
    }

    public static int[] bubble(int[] arr, int size) {
        for (int i = size - 2; i > -1; i--) {
            for (int j = 0; j < i + 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
