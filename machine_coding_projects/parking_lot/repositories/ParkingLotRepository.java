package machine_coding_projects.parking_lot.repositories;

import machine_coding_projects.parking_lot.models.Gate;
import machine_coding_projects.parking_lot.models.ParkingLot;

import java.util.Map;

public class ParkingLotRepository {

    private Map<Integer, ParkingLot> map;

    public ParkingLotRepository(Map<Integer, ParkingLot> parkingLot) {
        this.map = parkingLot;
    }

    public ParkingLot getParkingLotByGateId(int gateId){
        // select * from parking_lots p inner join gates g on g.parking_lot_id = p.id AND g.id = {{gate_id}}

        for (Map.Entry<Integer, ParkingLot> entry : map.entrySet()) {
            ParkingLot parkingLot = entry.getValue();
            for (Gate gate : parkingLot.getGates()) {
                if(gate.getId() == gateId){
                    return parkingLot;
                }
            }
        }
        return null;
    }
}
