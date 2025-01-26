package lab3;

import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        int choice;
        int seatID, custID;
        Scanner sc = new Scanner(System.in);
        Plane plane = new Plane();

        do {
            System.out.println("(1) Show number of empty seats");
            System.out.println("(2) Show the list of empty seats");
            System.out.println("(3) Show the list of seat assignments by seat ID");
            System.out.println("(4) Show the list of seat assignments by customer ID");
            System.out.println("(5) Assign a customer to a seat");
            System.out.println("(6) Remove a seat assignment");
            System.out.println("(7) Exit");
            System.out.println("Enter the number of your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    plane.showNumEmptySeats();
                    break;
                }
                case 2: {
                    plane.showEmptySeats();
                    break;
                }
                case 3: {
                    plane.showAssignedSeats(true);
                    break;
                }
                case 4: {
                    plane.showAssignedSeats(false);
                    break;
                }
                case 5: {
                    System.out.println("Assigning Seat..");
                    System.out.println("Please enter SeatID:");
                    seatID = sc.nextInt();
                    System.out.println("Please enter Customer ID:");
                    custID = sc.nextInt();
                    plane.assignSeat(seatID, custID);
                    break;
                }
                case 6: {
                    System.out.println("Enter SeatID to unassign customer from:");
                    seatID = sc.nextInt();
                    plane.unAssignSeat(seatID);
                }
            }

        } while (choice < 7);
    }
}
