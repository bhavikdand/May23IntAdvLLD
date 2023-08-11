package machine_coding_projects.parking_lot.strategies.pricing_strategy;

import machine_coding_projects.parking_lot.models.Slab;
import machine_coding_projects.parking_lot.models.VehicleType;
import machine_coding_projects.parking_lot.repositories.SlabRepository;
import machine_coding_projects.parking_lot.utils.DateTimeUtils;

import java.util.Date;
import java.util.List;

public class WeekendPricingStrategy implements PricingStrategy{

    // TODO get data from slab service
    private SlabRepository slabRepository;

    public WeekendPricingStrategy(SlabRepository slabRepository) {
        this.slabRepository = slabRepository;
    }

    @Override
    public double calculateAmount(Date entryTime, Date exitTime, VehicleType vehicleType) {
        List<Slab> slabs = this.slabRepository.getSlabsByVehicleType(vehicleType);
        int hoursSpent = DateTimeUtils.calculateHours(entryTime, exitTime);
        double amount = 0;
        for (Slab slab : slabs) {
            if(hoursSpent > slab.getEndHour()) { // this means we have consumed entire slab
                amount += (slab.getEndHour() - slab.getStartHour()) * slab.getPrice();
            }
            else if(slab.getEndHour() == -1 || hoursSpent <= slab.getEndHour()){
                amount += (hoursSpent - slab.getStartHour()) * slab.getPrice();
                break;
            }
        }
        return amount;
    }
}
