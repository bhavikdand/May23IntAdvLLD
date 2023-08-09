package machine_coding_projects.parking_lot.repositories;

import machine_coding_projects.parking_lot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {

    private Map<Integer, Gate> map;

    public GateRepository(Map<Integer, Gate> map) {
        this.map = map;
    }

    public GateRepository() {
        map = new HashMap<>();
    }

    public Gate getGateById(int gateId){
        return map.get(gateId);
    }
}
