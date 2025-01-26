package lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private int numEmptySeat;
    private PlaneSeat[] seat = new PlaneSeat[12];

    public Plane() {
        this.numEmptySeat = 12;
        for (int i = 1; i <= 12; i++) {
            seat[i - 1] = new PlaneSeat(i);
        }
    }

    private PlaneSeat[] sortSeats() {
        PlaneSeat[] temp = this.seat.clone();
        Arrays.sort(temp, Comparator.comparing(PlaneSeat::getCustomerID));
        return temp;
    }
    
    public void showNumEmptySeats() {
        System.out.println("There are " + this.numEmptySeat + " empty seats");
    }

    public void showEmptySeats() {
        System.out.println("The following seats are empty:");
        for (PlaneSeat planeSeat: this.seat) {
            if (!planeSeat.isOccupied()) {
                System.out.println("SeatID " + planeSeat.getSeatID());
            }
        }
    }
    public void showAssignedSeats(boolean bySeatID) {
        if (bySeatID) {
            for (PlaneSeat planeSeat: this.seat) {
                if (planeSeat.isOccupied()) {
                    System.out.println("SeatID " + planeSeat.getSeatID() + " assigned to CustomerID " + planeSeat.getCustomerID());
                }
            }
        } else {
            for (PlaneSeat planeSeat: this.sortSeats()) {
                if (planeSeat.isOccupied()) {
                    System.out.println("SeatID " + planeSeat.getSeatID() + " assigned to CustomerID " + planeSeat.getCustomerID());
                }
            }
        }
    }

    public void assignSeat(int seatId, int cust_id) {
        if (this.seat[seatId - 1].isOccupied()) {
            System.out.println("Seat already assigned to a customer.");
            return;
        }

        this.seat[seatId - 1].assign(cust_id);
        this.numEmptySeat -= 1;
        System.out.println("Seat Assigned!");
    }
    
    public void unAssignSeat(int seatId) {
        this.seat[seatId - 1].unAssign();
        this.numEmptySeat += 1;
        System.out.println("Seat unassigned!");
    }
}
