package machine_coding_projects.parking_lot.strategies.spot_assignment_strategy;

import machine_coding_projects.parking_lot.exceptions.ParkingSpotNotFoundException;
import machine_coding_projects.parking_lot.models.ParkingLot;
import machine_coding_projects.parking_lot.models.ParkingSpot;
import machine_coding_projects.parking_lot.models.VehicleType;

public interface SpotAssignmentStrategy {

    public ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType vehicleType) throws ParkingSpotNotFoundException;
}
