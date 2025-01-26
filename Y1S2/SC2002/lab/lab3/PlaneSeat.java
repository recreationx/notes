package lab3;

public class PlaneSeat {
    private int seatId;
    private boolean assigned;
    private int customerID;

    public PlaneSeat(int seat_id) {
        this.seatId = seat_id;
        this.assigned = false;
        this.customerID = -1;
    }

    public int getSeatID() {
        return this.seatId;
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public boolean isOccupied() {
        return this.assigned;
    }

    public void assign(int cust_id) {
        this.customerID = cust_id;
        this.assigned = true;
    }

    public void unAssign() {
        this.customerID = -1;
        this.assigned = false;
    }
}
