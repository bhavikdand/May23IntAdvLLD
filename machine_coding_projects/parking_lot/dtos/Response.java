package machine_coding_projects.parking_lot.dtos;

public class Response {
    private ResponseStatus responseStatus;
    private String message;

    public Response(ResponseStatus responseStatus, String message) {
        this.responseStatus = responseStatus;
        this.message = message;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public String getMessage() {
        return message;
    }
}
