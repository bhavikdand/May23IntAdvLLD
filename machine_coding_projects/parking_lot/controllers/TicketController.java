package machine_coding_projects.parking_lot.controllers;

import machine_coding_projects.parking_lot.dtos.GenerateTicketResponseDto;
import machine_coding_projects.parking_lot.services.TicketService;
import machine_coding_projects.parking_lot.dtos.GenerateTicketRequestDto;
import machine_coding_projects.parking_lot.models.Ticket;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    // POST /ticket
    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){
        try {
            Ticket ticket = ticketService.generateTicket(requestDto.getGateId(), requestDto.getRegistrationNumber(), requestDto.getVehicleType());
            return GenerateTicketResponseDto.getSuccessResponse(ticket);
        } catch (Exception e){
            return GenerateTicketResponseDto.getFailureResponse(e.getMessage());
        }
    }
}
