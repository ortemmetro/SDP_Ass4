package AbstractFactoryDesignPattern;

public class SamsungPhoneCase implements PhoneCase{

    @Override
    public void paint() {
        System.out.println("Case for Samsung with blue color");
    }
}
