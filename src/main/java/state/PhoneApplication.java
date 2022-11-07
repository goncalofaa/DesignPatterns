package state;

public class PhoneApplication {

    public static void main(String[] args) {

        Phone phone = new Phone();
        System.out.println(phone.getState());
        System.out.println(phone.getState().onHomeButton());
        System.out.println(phone.getState());
        System.out.println(phone.getState().onHomeButton());
        System.out.println(phone.getState());
    }
}
