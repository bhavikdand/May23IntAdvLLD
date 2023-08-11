package machine_coding_projects.parking_lot.controllers;

import machine_coding_projects.parking_lot.models.Invoice;
import machine_coding_projects.parking_lot.services.InvoiceService;

public class InvoiceController {

    private InvoiceService invoiceService;

    //TODO refactor this to use DTOs
    public Invoice createInvoice(int ticketId, int gateId){
        try {
            Invoice invoice = invoiceService.createInvoice(ticketId, gateId);
            return invoice;
        } catch (Exception e){
            return null;
        }
    }
}
