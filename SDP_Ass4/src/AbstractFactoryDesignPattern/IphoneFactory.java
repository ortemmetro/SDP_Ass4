package AbstractFactoryDesignPattern;

public class IphoneFactory implements GUIFactory{

    @Override
    public PhoneCharger createPhoneCharger() {
        return new IphonePhoneCharger();
    }

    @Override
    public PhoneCase createPhoneCase() {
        return new IphonePhoneCase();
    }
}
