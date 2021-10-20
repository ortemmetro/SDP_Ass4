package AbstractFactoryDesignPattern;

public class SamsungPhoneCharger implements PhoneCharger{

    @Override
    public void charge() {
        System.out.println("I'm charging Samsung");
    }
}
