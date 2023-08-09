package machine_coding_projects.parking_lot.dtos;

import machine_coding_projects.parking_lot.models.VehicleType;

public class GenerateTicketRequestDto {
    private int gateId;
    private String registrationNumber;
    private String vehicleType;

    public int getGateId() {
        return gateId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
