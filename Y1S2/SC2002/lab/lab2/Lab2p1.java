package lab2;
import java.util.Scanner;
import java.lang.Math;

public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Perform the following methods: ");
            System.out.println("1. multiplication test");
            System.out.println("2. quotient using division by subtraction");
            System.out.println("3. remainder using division by subtraction");
            System.out.println("4. count the number of digits");
            System.out.println("5. position of a digit");
            System.out.println("6. extract all odd digits");
            System.out.println("7. quit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.println("m?");
                    int m = sc.nextInt();
                    System.out.println("n?");
                    int n = sc.nextInt();
                    int result = divide(m, n);
                    System.out.println(m + "/" + n + "=" + result);
                    break;
                case 3:
                    System.out.println("m?");
                    m = sc.nextInt();
                    System.out.println("n?");
                    n = sc.nextInt();
                    result = modulus(m, n);
                    System.out.println(m + "%" + n + "=" + result);
                    break;
                case 4:
                    System.out.println("n?");
                    n = sc.nextInt();
                    if (n <= 0) {
                        System.out.println("Invalid.");
                        break;
                    }
                    System.out.println("n: " + n +  " - count = " + countDigits(n));
                    break;
                case 5:
                    System.out.println("n?");
                    n = sc.nextInt();
                    System.out.println("digit?");
                    m = sc.nextInt();
                    System.out.println("n: " + n +  " - position = " + position(n, m));
                    break;
                case 6:
                    System.out.println("n?");
                    long l = sc.nextLong();
                    if (l <= 0) {
                        System.out.println("Invalid input");
                        break;
                    }
                    System.out.println("oddDigits = " + extractOddDigits(l));
                    break;
            }
        } while (choice < 7);
    }
    
    public static void mulTest() {
        Scanner sc = new Scanner(System.in);
        int count = 0, correct = 0;
        while (count < 5) {
            int op1 = (int) (Math.random() * 9 + 1);
            int op2 = (int) (Math.random() * 9 + 1);
            System.out.println("How much is " + op1 + " times " + op2 + "?");
            int answer = Integer.valueOf(sc.nextLine());

            if (answer == op1 * op2) {
                correct++;
            }

            count++;
        }
        System.out.println(correct + " answers out of 5 are correct.");
    }

    public static int divide(int m, int n) {
        int result = 0;
        while (m >= n) {
            m -= n;
            result++;
        }
        return result;
    }

    public static int modulus(int m, int n) {
        return m - (divide(m, n) * n);
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int position(int n, int digit) {
        int pos = 0;
        while (n > 0) {
            if (n % 10 == digit) {
                return pos + 1;
            } else {
                n /= 10;
                pos++;
            }
        }
        return -1;
    }

    public static long extractOddDigits(long n) {
        int oddDigits = 0;
        int k = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                oddDigits += k * (n % 10);
                k *= 10;
            }
            n /= 10;
        }
        return oddDigits != 0 ? oddDigits : -1;
    }
}
