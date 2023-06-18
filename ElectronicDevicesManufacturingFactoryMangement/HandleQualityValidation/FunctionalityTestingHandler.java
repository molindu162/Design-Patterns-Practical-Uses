package HandleQualityValidation;

import Builders.Phone;

public class FunctionalityTestingHandler extends Handler{

    public FunctionalityTestingHandler(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(Phone phone) {
        return phone.isFunctioningCorrectly();
    }

    @Override
    public String toString(){
        return "Functionality Testing Handler";
    }
}
