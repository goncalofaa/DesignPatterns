package state.states;


import state.Phone;

public class ReadyState extends State{
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHomeButton() {
        return phone.home();
    }

    @Override
    public String onPowerButton() {
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}