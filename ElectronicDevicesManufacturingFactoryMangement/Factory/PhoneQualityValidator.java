package Factory;

import Builders.Phone;
import HandleQualityValidation.Handler;

public class PhoneQualityValidator {
    private Handler handler;

    public PhoneQualityValidator(Handler handler) {
        this.handler = handler;
    }

    public boolean handle(Phone phone){
        return handler.handle(phone);
    }

}
