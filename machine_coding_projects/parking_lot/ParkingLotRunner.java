package machine_coding_projects.parking_lot;

import machine_coding_projects.parking_lot.controllers.InvoiceController;
import machine_coding_projects.parking_lot.controllers.TicketController;
import machine_coding_projects.parking_lot.dtos.GenerateTicketRequestDto;
import machine_coding_projects.parking_lot.dtos.GenerateTicketResponseDto;
import machine_coding_projects.parking_lot.factories.PricingStrategyFactory;
import machine_coding_projects.parking_lot.models.*;
import machine_coding_projects.parking_lot.repositories.*;
import machine_coding_projects.parking_lot.services.*;
import machine_coding_projects.parking_lot.strategies.pricing_strategy.WeekdayPricingStrategy;
import machine_coding_projects.parking_lot.strategies.pricing_strategy.WeekendPricingStrategy;
import machine_coding_projects.parking_lot.strategies.spot_assignment_strategy.NearestFirstParkingAssignmentStrategy;

import java.util.*;

public class ParkingLotRunner {

    public static void main(String[] args) {
        List<ParkingFloor> parkingFloors = Arrays.asList(
                new ParkingFloor(1, Arrays.asList(
                        new ParkingSpot(1, "A1", SpotStatus.AVAILABLE, VehicleType.CAR),
                        new ParkingSpot(2, "A2", SpotStatus.AVAILABLE, VehicleType.CAR)
                ), 1, FloorStatus.OPERATIONAL)
//                new ParkingFloor(2, Arrays.asList(
//                    new ParkingSpot(3, "B1", SpotStatus.AVAILABLE, VehicleType.CAR),
//                    new ParkingSpot(4, "B2", SpotStatus.AVAILABLE, VehicleType.CAR)
//                        ), 2, FloorStatus.OPERATIONAL)
        );
        List<Gate> gates = Arrays.asList(
                new Gate(1, "G1", GateStatus.OPERATIONAL, new ParkingAttendant(1, "ABC", "DEF"), GateType.ENTRY),
                new Gate(2, "G2", GateStatus.OPERATIONAL, new ParkingAttendant(2, "PQR", "XYZ"), GateType.EXIT)
        );

        ParkingLot parkingLot = new ParkingLot(1, parkingFloors, gates, "PL1", "Bengaluru", new Date(), new Date());
        Map<Integer, ParkingLot> parkingLotMap = new HashMap(){{
            put(1, parkingLot);
        }};
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository(parkingLotMap);

        Map<Integer, Gate> gateMap = new HashMap<>();
        for (Gate gate : gates) {
            gateMap.put(gate.getId(), gate);
        }
        GateRepository gateRepository = new GateRepository(gateMap);

        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        /*
         There are 2 two options to insert data in to your database:
         1. Implement insert methods for all the entities. Con: too much time consuming
         2. Insert some dummy data into your repository via maps. Just like inserting some dummy data int your DB via a script. We are taking this option.
         */

        GateService gateService = new GateService(gateRepository);
        ParkingLotService parkingLotService = new ParkingLotService(parkingLotRepository);
        VehicleService vehicleService = new VehicleService(vehicleRepository);


        TicketService ticketService = new TicketService(gateService, vehicleService, parkingLotService, new NearestFirstParkingAssignmentStrategy(), ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        GenerateTicketRequestDto generateTicketRequestDto = new GenerateTicketRequestDto(1, "KA 05 123", VehicleType.CAR.name());
        GenerateTicketResponseDto generateTicketResponseDto = ticketController.generateTicket(generateTicketRequestDto);
        Ticket ticket1 = generateTicketResponseDto.getTicket();
        System.out.println(generateTicketResponseDto.getMessage());

        generateTicketRequestDto = new GenerateTicketRequestDto(1, "KA 05 1234", VehicleType.CAR.name());
        generateTicketResponseDto = ticketController.generateTicket(generateTicketRequestDto);
        System.out.println(generateTicketResponseDto.getMessage());

        generateTicketRequestDto = new GenerateTicketRequestDto(1, "KA 05 12345", VehicleType.CAR.name());
        generateTicketResponseDto = ticketController.generateTicket(generateTicketRequestDto);
        System.out.println(generateTicketResponseDto.getMessage());


        InvoiceRepository invoiceRepository = new InvoiceRepository();
        SlabRepository slabRepository = new SlabRepository(new HashMap<Integer, Slab>(){{
            put(1, new Slab(1, 0, 2, 20, VehicleType.CAR));
            put(2, new Slab(2, 2, 4, 15, VehicleType.CAR));
            put(3, new Slab(3, 4, 8, 10, VehicleType.CAR));
            put(4, new Slab(4, 8, -1, 20, VehicleType.CAR));
        }});
        PricingStrategyFactory pricingStrategyFactory = new PricingStrategyFactory(new WeekendPricingStrategy(slabRepository), new WeekdayPricingStrategy());
        InvoiceService invoiceService = new InvoiceService(ticketService, gateService, invoiceRepository, pricingStrategyFactory);

        InvoiceController invoiceController = new InvoiceController(invoiceService);
        Invoice invoice = invoiceController.createInvoice(ticket1.getId(), ticket1.getGate().getId());
        System.out.println(invoice.getAmount());
    }
}
