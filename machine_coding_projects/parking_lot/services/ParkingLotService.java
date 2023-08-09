package machine_coding_projects.parking_lot.services;

import machine_coding_projects.parking_lot.models.ParkingLot;
import machine_coding_projects.parking_lot.repositories.ParkingLotRepository;

public class ParkingLotService {

    private ParkingLotRepository parkingLotRepository;

    public ParkingLot getParkingLotByGateId(int gateId){
        return parkingLotRepository.getParkingLotByGateId(gateId);
    }
}
