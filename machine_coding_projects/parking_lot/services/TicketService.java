package machine_coding_projects.parking_lot.services;

import machine_coding_projects.parking_lot.exceptions.ParkingSpotNotFoundException;
import machine_coding_projects.parking_lot.models.*;
import machine_coding_projects.parking_lot.repositories.TicketRepository;
import machine_coding_projects.parking_lot.strategies.spot_assignment_strategy.SpotAssignmentStrategy;

import java.util.Date;

public class TicketService {

    private GateService gateService;
    private VehicleService vehicleService;

    private ParkingLotService parkingLotService;

    private SpotAssignmentStrategy spotAssignmentStrategy;
    private TicketRepository ticketRepository;

    public TicketService(GateService gateService, VehicleService vehicleService, ParkingLotService parkingLotService, SpotAssignmentStrategy spotAssignmentStrategy, TicketRepository ticketRepository) {
        this.gateService = gateService;
        this.vehicleService = vehicleService;
        this.parkingLotService = parkingLotService;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.ticketRepository = ticketRepository;
    }

    public Ticket generateTicket(int gateId, String registrationNumber, String vehicleTypeStr) throws ParkingSpotNotFoundException{
        // Step required to generate a ticket
        /*
        1. Get gate attendant
        2. Insert if not exists and get the vehicle object
        3. Figure out parking spot
            1] If no parking spot available, then throw an exception
        4. Generate the ticket object and store it in DB
         */
        Gate gate = this.gateService.getGateById(gateId);
        VehicleType vehicleType = VehicleType.getVehicleType(vehicleTypeStr); //VehicleType.valueOf(vehicleTypeStr) <- Case sensitive

        Vehicle vehicle = this.vehicleService.insertIfNotExists(registrationNumber, vehicleType);

        ParkingLot parkingLot = this.parkingLotService.getParkingLotByGateId(gateId);

        ParkingSpot parkingSpot = spotAssignmentStrategy.assignSpot(parkingLot, vehicleType);

        return this.ticketRepository.insertTicket(vehicle, gate, parkingSpot, new Date());

    }

    public Ticket getTicketById(int ticketId){
        return this.ticketRepository.getTicketById(ticketId);
    }

}
