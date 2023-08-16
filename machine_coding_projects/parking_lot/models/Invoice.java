package machine_coding_projects.parking_lot.models;

import java.util.Date;

public class Invoice extends BaseModel{

    private Ticket ticket;
    private Gate gate;
    private ParkingAttendant parkingAttendant;
    private Date exitTime;

    private double amount;

    public Invoice(int id, Ticket ticket, Gate gate, ParkingAttendant parkingAttendant, Date exitTime, double amount) {
        super(id);
        this.ticket = ticket;
        this.gate = gate;
        this.parkingAttendant = parkingAttendant;
        this.exitTime = exitTime;
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Gate getGate() {
        return gate;
    }

    public ParkingAttendant getParkingAttendant() {
        return parkingAttendant;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public double getAmount() {
        return amount;
    }
}
