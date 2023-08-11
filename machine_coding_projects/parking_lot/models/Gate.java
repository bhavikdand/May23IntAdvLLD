package machine_coding_projects.parking_lot.models;

public class Gate extends BaseModel {
    private String name;
    private GateStatus gateStatus;
    private ParkingAttendant parkingAttendant;
    private GateType gateType;

    public Gate(int id, String name, GateStatus gateStatus, ParkingAttendant parkingAttendant, GateType gateType) {
        super(id);
        this.name = name;
        this.gateStatus = gateStatus;
        this.parkingAttendant = parkingAttendant;
        this.gateType = gateType;
    }

    public String getName() {
        return name;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public ParkingAttendant getParkingAttendant() {
        return parkingAttendant;
    }

    public GateType getGateType() {
        return gateType;
    }
}
