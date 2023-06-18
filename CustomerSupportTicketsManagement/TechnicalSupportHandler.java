public class TechnicalSupportHandler extends TicketHandler{



    public TechnicalSupportHandler(TicketHandler next){
        super(next);
    }

    @Override
    public boolean doHandle(Ticket ticket) {
        return (ticket.getId().equals("1234"));
    }

    @Override
    public String toString(){
        return "Technical Support Handler";
    }

}
