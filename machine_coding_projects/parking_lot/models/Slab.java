package machine_coding_projects.parking_lot.models;

public class Slab extends BaseModel{

    private int startHour;
    private int endHour;

    private double price;
    private VehicleType vehicleType;

    public Slab(int id, int startHour, int endHour, double price, VehicleType vehicleType) {
        super(id);
        this.startHour = startHour;
        this.endHour = endHour;
        this.price = price;
        this.vehicleType = vehicleType;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getEndHour() {
        return endHour;
    }

    public double getPrice() {
        return price;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
