package Builders;

public class Phone {
    private boolean hasPhysicalDamage;
    private boolean functioningCorrectly;
    private boolean softwareValidity;

    public boolean hasPhysicalDamage() {
        return hasPhysicalDamage;
    }

    public boolean isFunctioningCorrectly() {
        return functioningCorrectly;
    }

    public boolean hasSoftwareValidity() {
        return softwareValidity;
    }

    public void setHasPhysicalDamage(boolean hasPhysicalDamage) {
        this.hasPhysicalDamage = hasPhysicalDamage;
    }

    public void setFunctioningCorrectly(boolean functioningCorrectly) {
        this.functioningCorrectly = functioningCorrectly;
    }

    public void setSoftwareValidity(boolean softwareValidity) {
        this.softwareValidity = softwareValidity;
    }

}
