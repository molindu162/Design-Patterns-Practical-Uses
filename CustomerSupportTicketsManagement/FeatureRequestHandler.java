public class FeatureRequestHandler extends TicketHandler{

    public FeatureRequestHandler(TicketHandler handler) {
        super(handler);
    }

    @Override
    public String toString(){
        return "Feature Request Handler";
    }

    @Override
    public boolean doHandle(Ticket ticket) {
        return ticket.isSpecialFeatureRequests();
    }
}
