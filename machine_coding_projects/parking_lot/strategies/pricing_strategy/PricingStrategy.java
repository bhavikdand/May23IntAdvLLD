package machine_coding_projects.parking_lot.strategies.pricing_strategy;

import machine_coding_projects.parking_lot.models.Vehicle;
import machine_coding_projects.parking_lot.models.VehicleType;

import java.util.Date;

public interface PricingStrategy {

    double calculateAmount(Date entryTime, Date exitTime, VehicleType vehicleType);
}
