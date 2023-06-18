package src.CustomerSupportTicketsManagement;

public class Ticket {
    private String id;
    private boolean billed;
    private boolean specialFeatureRequests;

    public Ticket(String id, boolean billed, boolean specialFeatureRequests){
        this.id = id;
        this.billed = billed;
        this.specialFeatureRequests = specialFeatureRequests;
    }

    public String getId() {
        return id;
    }

    public boolean isBilled() {
        return billed;
    }

    public boolean isSpecialFeatureRequests() {
        return specialFeatureRequests;
    }


}
