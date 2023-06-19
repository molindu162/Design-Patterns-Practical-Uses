package Factory;

import Builders.Iphone;
import Builders.PhoneBuilder;
import HandleQualityValidation.FunctionalityTestingHandler;
import HandleQualityValidation.PhysicalInspectionHandler;
import HandleQualityValidation.SoftwareValidationHandler;

public class IphoneFactory extends AppleDevicesFactory{
    private PhoneQualityValidator validator;
    @Override
    public Iphone createIphone(PhoneBuilder builder) {
        builder.setProcessor("A15");
        builder.setDisplaySize(15);
        builder.setCameraPixels(20);
        builder.setStorage(128);
        builder.setRAMSize(8);
        Iphone iphone = builder.buildIphone();

        iphone.setHasPhysicalDamage(false);
        iphone.setFunctioningCorrectly(false);
        iphone.setSoftwareValidity(true);

        SoftwareValidationHandler softwareValidationHandler = new SoftwareValidationHandler(null);
        FunctionalityTestingHandler functionalityTestingHandler = new FunctionalityTestingHandler(softwareValidationHandler);
        PhysicalInspectionHandler physicalInspectionHandler = new PhysicalInspectionHandler(functionalityTestingHandler);
        validator = new PhoneQualityValidator(physicalInspectionHandler);
        if (validator.handle(iphone)){
            return iphone;
        }
        return null;
    }
}
