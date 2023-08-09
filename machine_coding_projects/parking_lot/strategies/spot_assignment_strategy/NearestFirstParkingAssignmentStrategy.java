package machine_coding_projects.parking_lot.strategies.spot_assignment_strategy;

import machine_coding_projects.parking_lot.exceptions.ParkingSpotNotFoundException;
import machine_coding_projects.parking_lot.models.*;

public class NearestFirstParkingAssignmentStrategy implements SpotAssignmentStrategy{

    @Override
    public ParkingSpot assignSpot(ParkingLot parkingLot, VehicleType vehicleType) throws ParkingSpotNotFoundException{
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            if(parkingFloor.getStatus().equals(FloorStatus.OPERATIONAL)){
                for (ParkingSpot spot : parkingFloor.getSpots()) {
                    if(spot.getStatus().equals(SpotStatus.AVAILABLE) && spot.getSupportedVehicleType().equals(vehicleType)){
                        spot.setStatus(SpotStatus.OCCUPIED);
                        return spot;
                    }
                }
            }
        }
        throw new ParkingSpotNotFoundException("Parking spot for " + vehicleType + " is not available");
    }
}
