package FactoryDesignPattern;

public class PngReader implements ImageReader{
    private DecodedImage decodedImage;

    public PngReader(String image){
        this.decodedImage = new DecodedImage(image);
    }

    @Override
    public DecodedImage getDecodedImage() {
        return decodedImage;
    }
}
