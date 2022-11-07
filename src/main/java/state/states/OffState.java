package state.states;

import state.Phone;

public class OffState extends State {
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHomeButton() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onPowerButton() {
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }
}