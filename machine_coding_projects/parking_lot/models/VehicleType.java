package machine_coding_projects.parking_lot.models;

public enum VehicleType {
    CAR,
    BIKE,
    SUV,
    TRUCK;

    public static VehicleType getVehicleType(String type){
        if("car".equalsIgnoreCase(type)){
            return CAR;
        }
        if("bike".equalsIgnoreCase(type)){
            return BIKE;
        }
        if("suv".equalsIgnoreCase(type)){
            return SUV;
        }
        if("truck".equalsIgnoreCase(type)){
            return TRUCK;
        }
        return CAR;
    }
}
