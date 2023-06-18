package Factory;

import Builders.Phone;
import HandleQualityValidation.Handler;

public class PhoneQualityValidator {
    private Handler handler;
    public PhoneQualityValidator(Handler handler) {
        this.handler = handler;
    }

    public boolean handle(Phone phone){
        handler.handle(phone);
        return handler.isPhoneEligible();
    }

}
