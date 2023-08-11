package machine_coding_projects.parking_lot.services;

import machine_coding_projects.parking_lot.factories.PricingStrategyFactory;
import machine_coding_projects.parking_lot.models.Gate;
import machine_coding_projects.parking_lot.models.Invoice;
import machine_coding_projects.parking_lot.models.Ticket;
import machine_coding_projects.parking_lot.repositories.InvoiceRepository;
import machine_coding_projects.parking_lot.strategies.pricing_strategy.PricingStrategy;

import java.util.Date;

public class InvoiceService {

    private TicketService ticketService;
    private GateService gateService;
    private InvoiceRepository invoiceRepository;

    private PricingStrategyFactory pricingStrategyFactory;

    public InvoiceService(TicketService ticketService, GateService gateService, InvoiceRepository invoiceRepository, PricingStrategyFactory pricingStrategyFactory) {
        this.ticketService = ticketService;
        this.gateService = gateService;
        this.invoiceRepository = invoiceRepository;
        this.pricingStrategyFactory = pricingStrategyFactory;
    }

    public Invoice createInvoice(int ticketId, int gateId) throws Exception{

        Ticket ticket = this.ticketService.getTicketById(ticketId);

        if(ticket == null){
            // TODO make this a custom exception
            throw new Exception("Invalid ticket");
        }
        // TODO check if an invoice already exists for this ticket
        /*
        If today is weekday
         then pricingStrategy = new WeekdayPricingStrategy()
        else
            pricingStrategy = new WeekendPricingStrategy()
        This code will lead to SRP and OCP violation

         */
        Date exitTime = new Date();
        PricingStrategy pricingStrategy = pricingStrategyFactory.getPricingStrategy(exitTime);
        double amount = pricingStrategy.calculateAmount(ticket.getEntryTime(), exitTime, ticket.getVehicle().getVehicleType());

        Gate gate = this.gateService.getGateById(gateId);

        return this.invoiceRepository.insertInvoice(ticket, gate, exitTime, amount);
    }
}
