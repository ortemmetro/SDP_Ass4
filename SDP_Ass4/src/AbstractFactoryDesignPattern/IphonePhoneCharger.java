package AbstractFactoryDesignPattern;

public class IphonePhoneCharger implements PhoneCharger{

    @Override
    public void charge() {
        System.out.println("I'm charging Iphone");
    }
}
