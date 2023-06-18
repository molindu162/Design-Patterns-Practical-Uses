package HandleQualityValidation;

import Builders.Phone;

public class PhysicalInspectionHandler extends Handler{
    public PhysicalInspectionHandler(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(Phone phone) {
        return !phone.hasPhysicalDamage();
    }

    @Override
    public String toString(){
        return "Physical Inspection Handler";
    }
}
