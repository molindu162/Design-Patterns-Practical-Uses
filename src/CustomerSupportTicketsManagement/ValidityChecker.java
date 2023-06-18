package src.CustomerSupportTicketsManagement;

public class ValidityChecker {
    private TicketHandler handler;

    public ValidityChecker(TicketHandler handler) {
        this.handler = handler;
    }

    public void handle(Ticket ticket){
        handler.handle(ticket);
    }
}
