package AbstractFactoryDesignPattern;

public interface GUIFactory {
    PhoneCharger createPhoneCharger();
    PhoneCase createPhoneCase();
}
