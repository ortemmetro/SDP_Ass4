package AbstractFactoryDesignPattern;

public class Demo {
    public static void main(String[] args) {
        GUIFactory factory;
        String phoneName = "Samsung";
        if(phoneName.equals("Iphone")){
            factory = new IphoneFactory();
        } else{
            factory = new SamsungFactory();
        }

        factory.createPhoneCase().paint();
        factory.createPhoneCharger().charge();


    }
}
