package machine_coding_projects.parking_lot.services;

import machine_coding_projects.parking_lot.models.Vehicle;
import machine_coding_projects.parking_lot.models.VehicleType;
import machine_coding_projects.parking_lot.repositories.VehicleRepository;

public class VehicleService {

    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle insertIfNotExists(String registrationNumber, VehicleType vehicleType){
        Vehicle vehicle = this.vehicleRepository.getVehicleByRegistrationNumber(registrationNumber);
        if(vehicle == null){
            return this.vehicleRepository.insertVehicle(registrationNumber, vehicleType);
        }
        return vehicle;
    }


}
