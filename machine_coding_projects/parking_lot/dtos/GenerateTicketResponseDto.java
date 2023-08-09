package machine_coding_projects.parking_lot.dtos;

import machine_coding_projects.parking_lot.models.Ticket;

public class GenerateTicketResponseDto {

    public GenerateTicketResponseDto(Ticket ticket, ResponseStatus responseStatus) {
        this.ticket = ticket;
        this.responseStatus = responseStatus;
    }

    public GenerateTicketResponseDto(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    private Ticket ticket;
    private ResponseStatus responseStatus;

    public static GenerateTicketResponseDto getSuccessResponse(Ticket ticket){
        return new GenerateTicketResponseDto(ticket, ResponseStatus.SUCCESS);
    }

    public static GenerateTicketResponseDto getFailureResponse(){
        return new GenerateTicketResponseDto(ResponseStatus.FAILURE);
    }
}
