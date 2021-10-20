package FactoryDesignPattern;

public class FactoryMethod {
    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;

        String image = "Dogs";
        String volume = "100Kb";

        if (volume.equals("500Kb")) {
            reader = new GifReader(image);
        }
        if (volume.equals("100Kb")) {
            reader = new JpegReader(image);
        }
        if(volume.equals("50Kb")){
            reader = new PngReader(image);
        }

        decodedImage = reader.getDecodedImage();
        System.out.println(decodedImage.toString());
    }
}
