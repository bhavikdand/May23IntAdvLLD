package machine_coding_projects.parking_lot.models;

import java.util.List;

public class ParkingFloor  extends BaseModel{

    private List<ParkingSpot> spots;
    private int floorNumber;

    private FloorStatus status;

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public FloorStatus getStatus() {
        return status;
    }
}
