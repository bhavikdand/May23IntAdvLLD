package machine_coding_projects.parking_lot.models;

public class Vehicle extends BaseModel{
    private String registrationNumber;
    private VehicleType vehicleType;

    public Vehicle(int id, String registrationNumber, VehicleType vehicleType) {
        super(id);
        this.registrationNumber = registrationNumber;
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
