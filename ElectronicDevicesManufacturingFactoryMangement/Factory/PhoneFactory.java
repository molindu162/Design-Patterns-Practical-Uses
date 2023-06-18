package Factory;

import Builders.Iphone;
import Builders.PhoneBuilder;

public abstract class PhoneFactory {

    public abstract Iphone createIphone(PhoneBuilder builder);
}
