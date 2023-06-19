import Builders.IPhoneBuilder;
import Builders.Iphone;
import Factory.IphoneFactory;

public class Main2 {
    public static void main(String[] args){
        IphoneFactory iphoneFactory = new IphoneFactory();
        Iphone iPhone = iphoneFactory.createIphone(new IPhoneBuilder());
        if (iPhone != null)
            System.out.println("New Iphone created");
        else
            System.out.println("Iphone building process failed!");

    }

}
