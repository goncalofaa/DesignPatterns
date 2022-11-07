package factory;

public class Circle implements Shape {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int i){
        this.radius=i;
    }

    @Override
    public int getEdgeCount() {
        return 1;
    }

    @Override
    public Circle createSmallerShape() {
        return new Circle(radius/2);
    }
}
