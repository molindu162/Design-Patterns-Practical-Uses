package Factories;
import Builders.Iphone;
import Builders.PhoneBuilder;

public abstract class AppleDevicesFactory extends PhoneFactory {
    @Override
    public abstract Iphone createIphone(PhoneBuilder builder);
}
