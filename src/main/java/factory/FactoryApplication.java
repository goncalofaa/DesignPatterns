package factory;

public class FactoryApplication {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.println(((Circle) shapeFactory.getShape("circle")).createSmallerShape().getRadius());
        System.out.println(((Square) shapeFactory.getShape("square")).createSmallerShape().getWidth());
    }
}
