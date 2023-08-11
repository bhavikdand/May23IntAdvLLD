package machine_coding_projects.parking_lot.strategies.pricing_strategy;

import machine_coding_projects.parking_lot.models.VehicleType;
import machine_coding_projects.parking_lot.utils.DateTimeUtils;

import java.util.Date;

public class WeekdayPricingStrategy implements PricingStrategy{
    @Override
    public double calculateAmount(Date entryTime, Date exitTime, VehicleType vehicleType) {
        int hours = DateTimeUtils.calculateHours(entryTime, exitTime);
        return hours * 10;
    }
}
