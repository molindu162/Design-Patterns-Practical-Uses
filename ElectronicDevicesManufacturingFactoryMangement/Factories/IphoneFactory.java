package Factories;

import Builders.Iphone;
import Builders.PhoneBuilder;

public class IphoneFactory extends AppleDevicesFactory{
    @Override
    public Iphone createIphone(PhoneBuilder builder) {
        builder.setProcessor("A15");
        builder.setDisplaySize(15);
        builder.setCameraPixels(20);
        builder.setStorage(128);
        builder.setRAMSize(8);
        return builder.buildIphone();
    }
}
