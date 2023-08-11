package machine_coding_projects.parking_lot.repositories;

import machine_coding_projects.parking_lot.models.Vehicle;
import machine_coding_projects.parking_lot.models.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {

    private Map<Integer, Vehicle> map;
    private static int id = 0;

    public VehicleRepository(Map<Integer, Vehicle> map) {
        this.map = map;
    }

    public VehicleRepository() {
        map = new HashMap<>();
    }

    public Vehicle getVehicleByRegistrationNumber(String registrationNumber){
        for (Map.Entry<Integer, Vehicle> entry : map.entrySet()) {
            Vehicle vehicle = entry.getValue();
            if(vehicle.getRegistrationNumber().equals(registrationNumber)){
                return vehicle;
            }
        }
        return null;
    }

    public Vehicle insertVehicle(String registrationNumber, VehicleType vehicleType){
        this.id++;
        Vehicle vehicle = new Vehicle(this.id, registrationNumber, vehicleType);
        map.put(id, vehicle);
        return vehicle;
    }
}
