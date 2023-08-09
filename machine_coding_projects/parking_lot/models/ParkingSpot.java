package machine_coding_projects.parking_lot.models;

public class ParkingSpot extends BaseModel{
    private String name;
    private SpotStatus status;
    private VehicleType supportedVehicleType;


    public String getName() {
        return name;
    }

    public SpotStatus getStatus() {
        return status;
    }

    public VehicleType getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setStatus(SpotStatus status) {
        this.status = status;
    }
}
