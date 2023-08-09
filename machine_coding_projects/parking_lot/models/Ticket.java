package machine_coding_projects.parking_lot.models;

import java.util.Date;

public class Ticket extends BaseModel{
    private Vehicle vehicle;
    private Date entryTime;

    private ParkingSpot parkingSpot;
    private Gate gate;
    private ParkingAttendant parkingAttendant;

    public Ticket(int id, Vehicle vehicle, Date entryTime, ParkingSpot parkingSpot, Gate gate, ParkingAttendant parkingAttendant) {
        super(id);
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
        this.gate = gate;
        this.parkingAttendant = parkingAttendant;
    }
}
