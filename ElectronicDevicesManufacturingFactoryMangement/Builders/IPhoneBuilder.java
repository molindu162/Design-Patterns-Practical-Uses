package Builders;

public class IPhoneBuilder implements PhoneBuilder{
    private String processor;
    private int displaySize;
    private int cameraPixels;
    private int storage;
    private int RAM;

    @Override
    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    @Override
    public void setCameraPixels(int pixels) {
        this.cameraPixels = pixels;
    }

    @Override
    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public void setRAMSize(int RAMSize) {
        this.RAM = RAMSize;
    }

    @ Override
    public Iphone buildIphone(){
        return new Iphone(processor, displaySize, cameraPixels, storage, RAM);
    }
}
