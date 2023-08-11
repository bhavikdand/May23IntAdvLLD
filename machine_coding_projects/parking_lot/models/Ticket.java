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

    @Override
    public String toString() {
        return "Ticket{" +
                "vehicle=" + vehicle +
                ", entryTime=" + entryTime +
                ", parkingSpot=" + parkingSpot +
                ", gate=" + gate +
                ", parkingAttendant=" + parkingAttendant +
                '}';
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Gate getGate() {
        return gate;
    }

    public ParkingAttendant getParkingAttendant() {
        return parkingAttendant;
    }
}
