package decorator.decorators;

import decorator.ChristmasTree;

public class Lights extends Decorator{

    public Lights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " and Lights";
    }
}
