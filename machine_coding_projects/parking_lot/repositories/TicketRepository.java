package machine_coding_projects.parking_lot.repositories;

import machine_coding_projects.parking_lot.models.Gate;
import machine_coding_projects.parking_lot.models.ParkingSpot;
import machine_coding_projects.parking_lot.models.Ticket;
import machine_coding_projects.parking_lot.models.Vehicle;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TicketRepository {

    private Map<Integer, Ticket> map;
    private static int ID = 0;

    public TicketRepository(Map<Integer, Ticket> map) {
        this.map = map;
    }

    public TicketRepository() {
        this.map = new HashMap<>();
    }

    public Ticket insertTicket(Vehicle vehicle, Gate gate, ParkingSpot parkingSpot, Date entryTime){
        ID++;
        Ticket ticket = new Ticket(ID, vehicle, entryTime, parkingSpot, gate, gate.getParkingAttendant());
        map.put(ID, ticket);
        return ticket;
    }

    public Ticket getTicketById(int ticketId){
        return map.get(ticketId);
    }
}
