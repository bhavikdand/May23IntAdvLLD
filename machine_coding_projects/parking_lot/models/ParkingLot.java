package machine_coding_projects.parking_lot.models;

import java.util.Date;
import java.util.List;

public class ParkingLot extends BaseModel{

    public ParkingLot(int id, List<ParkingFloor> parkingFloors, List<Gate> gates, String name, String address, Date startTime, Date endTime) {
        super(id);
        this.parkingFloors = parkingFloors;
        this.gates = gates;
        this.name = name;
        this.address = address;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private String name;
    private String address;
    private Date startTime;
    private Date endTime;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
}
