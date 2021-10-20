package AbstractFactoryDesignPattern;

public class SamsungFactory implements GUIFactory {

    @Override
    public PhoneCharger createPhoneCharger() {
        return new SamsungPhoneCharger();
    }

    @Override
    public PhoneCase createPhoneCase() {
        return new SamsungPhoneCase();
    }
}
