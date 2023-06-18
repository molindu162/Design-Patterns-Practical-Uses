package HandleQualityValidation;

import Builders.Phone;

public abstract class Handler {
    private Handler next;
    private boolean phoneEligible = true;

    public Handler(Handler next){
        this.next = next;
    }

    public void handle(Phone phone){
        if (phone == null) {
            phoneEligible = false;
            return;
        }

        if (!doHandle(phone)) {
            phoneEligible = false;
            return;
        }

        if (next == null) {
            System.out.println(this.toString() + " Handled successfully");
            return;
        }

        System.out.println(this.toString() + " Handled successfully");
        next.handle(phone);
    }

    public boolean isPhoneEligible(){
        return phoneEligible;
    }

    public abstract boolean doHandle(Phone phone);
}
