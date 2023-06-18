package Builders;

public interface PhoneBuilder {
    void setProcessor(String processor);
    void setDisplaySize(int size);
    void setCameraPixels(int Pixels);
    void setStorage(int storage);
    void setRAMSize(int RAMSize);
    Iphone buildIphone();
}
