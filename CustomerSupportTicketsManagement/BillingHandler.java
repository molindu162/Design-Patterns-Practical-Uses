public class BillingHandler extends TicketHandler{

    public BillingHandler(TicketHandler handler) {
        super(handler);
    }

    @Override
    public boolean doHandle(Ticket ticket) {
        return (ticket.isBilled());
    }

    @Override
    public String toString(){
        return "Billing Handler";
    }

}
