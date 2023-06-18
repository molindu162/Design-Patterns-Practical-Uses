public abstract class TicketHandler {
    private TicketHandler next;

    public TicketHandler(TicketHandler handler){
        next = handler;
    }

    public void handle(Ticket ticket){
        if (ticket == null){
            return;
        }

        if (!doHandle(ticket)){
            return;
        }

        if (next == null){
            System.out.println(this.toString() + " handled");
            return;
        }

        System.out.println(this.toString() + " handled");
        next.handle(ticket);


    }

    public abstract boolean doHandle(Ticket ticket);

}
