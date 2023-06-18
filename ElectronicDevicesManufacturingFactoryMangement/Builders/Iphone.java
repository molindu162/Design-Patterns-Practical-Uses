package Builders;

public class Iphone extends Phone{
    private String processor;
    private int displaySize;
    private int cameraPixels;
    private int storage;
    private int RAM;

    public Iphone(String processor, int displaySize, int cameraPixels, int storage, int RAM) {
        this.processor = processor;
        this.displaySize = displaySize;
        this.cameraPixels = cameraPixels;
        this.storage = storage;
        this.RAM = RAM;
    }
    public String getProcessor() {
        return processor;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public int getCameraPixels() {
        return cameraPixels;
    }

    public int getStorage() {
        return storage;
    }

    public int getRAM() {
        return RAM;
    }
}
