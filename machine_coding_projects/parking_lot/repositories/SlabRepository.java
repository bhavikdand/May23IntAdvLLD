package machine_coding_projects.parking_lot.repositories;

import machine_coding_projects.parking_lot.models.Slab;
import machine_coding_projects.parking_lot.models.VehicleType;

import java.util.*;

public class SlabRepository {
    private Map<Integer, Slab> map;
    private static int ID = 0;

    public SlabRepository(Map<Integer, Slab> map) {
        this.map = map;
    }

    public SlabRepository() {
        this.map = new HashMap<>();
    }

    public List<Slab> getSlabsByVehicleType(VehicleType vehicleType){
        List<Slab> result = new ArrayList<>();
        for (Map.Entry<Integer, Slab> entry : map.entrySet()) {
            if(entry.getValue().getVehicleType().equals(vehicleType)){
                result.add(entry.getValue());
            }
        }
        result.sort(new Comparator<Slab>() {
            @Override
            public int compare(Slab o1, Slab o2) {
               return o1.getStartHour()-o2.getStartHour();
            }
        });
        return result;
    }
}
