package AbstractFactoryDesignPattern;

public class IphonePhoneCase implements PhoneCase{

    @Override
    public void paint() {
        System.out.println("Case for Iphone with red color");
    }
}
