public class Phone implements Phones{
    private int displaySize;
    private int cameraPixels;
    private int storage;
    private int RAM;

    public Phone(int displaySize, int cameraPixels, int storage, int RAM) {
        this.displaySize = displaySize;
        this.cameraPixels = cameraPixels;
        this.storage = storage;
        this.RAM = RAM;
    }

    @Override
    public int setDisplaySize(int size) {
        return displaySize;
    }

    @Override
    public int setCameraPixels(int Pixels) {
        return cameraPixels;
    }

    @Override
    public int setStorage(int storage) {
        return storage;
    }

    @Override
    public int setRAMSize(int RAMSize) {
        return RAM;
    }
}
