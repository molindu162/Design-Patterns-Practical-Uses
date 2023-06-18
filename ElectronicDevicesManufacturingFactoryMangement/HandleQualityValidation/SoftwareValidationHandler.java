package HandleQualityValidation;

import Builders.Phone;

public class SoftwareValidationHandler extends Handler{
    public SoftwareValidationHandler(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(Phone phone) {
        return phone.hasSoftwareValidity();
    }

    @Override
    public String toString(){
        return "Software Validity Handler";
    }
}
