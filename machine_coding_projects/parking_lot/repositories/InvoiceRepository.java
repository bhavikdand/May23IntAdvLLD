package machine_coding_projects.parking_lot.repositories;

import machine_coding_projects.parking_lot.models.Invoice;
import machine_coding_projects.parking_lot.models.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class InvoiceRepository {

    private Map<Integer, Invoice> map;
    private static int ID = 0;

    public InvoiceRepository(Map<Integer, Invoice> map) {
        this.map = map;
    }

    public InvoiceRepository() {
        this.map = new HashMap<>();
    }



    public Invoice insertInvoice(Ticket ticket, Gate gate, Date exitTime, double amount){
        ID++;
        Invoice invoice = new Invoice(ID, ticket, gate, gate.getParkingAttendant(), exitTime, amount);
        map.put(ID, invoice);
        return invoice;
    }
}
