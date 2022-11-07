package decorator;

import decorator.decorators.Lights;
import decorator.decorators.Snow;

public class DecoratorApp {

    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        System.out.println(christmasTree.decorate());
        ChristmasTree christmasTree1 = new ChristmasTreeImpl();
        Lights lights = new Lights(christmasTree1);
        System.out.println(lights.decorate());
        Snow snow = new Snow(lights);
        System.out.println(snow.decorate());
    }
}
