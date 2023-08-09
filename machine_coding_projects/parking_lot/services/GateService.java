package machine_coding_projects.parking_lot.services;

import machine_coding_projects.parking_lot.models.Gate;
import machine_coding_projects.parking_lot.repositories.GateRepository;

public class GateService {

    private GateRepository gateRepository;

    public Gate getGateById(int gateId){
        return this.gateRepository.getGateById(gateId);
    }
}
