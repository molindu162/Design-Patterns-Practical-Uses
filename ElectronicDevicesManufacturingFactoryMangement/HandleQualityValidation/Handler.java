package HandleQualityValidation;

import Builders.Phone;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next){
        this.next = next;
    }

    public boolean handle(Phone phone){
        if (phone == null) {
            return false;
        }

        if (!doHandle(phone)) {
            System.out.println(this.toString() + " failed");
            return false;
        }

        if (next == null) {
            System.out.println(this.toString() + " Handled successfully");
            return true;
        }

        System.out.println(this.toString() + " Handled successfully");
        return next.handle(phone);
    }


    public abstract boolean doHandle(Phone phone);
}
