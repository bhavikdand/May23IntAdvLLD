package machine_coding_projects.parking_lot.dtos;

import machine_coding_projects.parking_lot.models.Ticket;

public class GenerateTicketResponseDto {

    public GenerateTicketResponseDto(Ticket ticket, Response response) {
        this.ticket = ticket;
        this.response = response;
    }


    private Ticket ticket;
    private Response response;

    public static GenerateTicketResponseDto getSuccessResponse(Ticket ticket){
        return new GenerateTicketResponseDto(ticket, new Response(ResponseStatus.SUCCESS, "Successfully generated a ticket"));
    }

    public static GenerateTicketResponseDto getFailureResponse(String message){
        return new GenerateTicketResponseDto(null, new Response(ResponseStatus.FAILURE, message));
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getMessage(){
        return response.getMessage();
    }
}
