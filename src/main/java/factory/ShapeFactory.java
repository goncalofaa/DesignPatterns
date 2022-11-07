package factory;

public class ShapeFactory {

    public Shape getShape(String shape){
        return switch (shape){
            case "circle" -> new Circle(10);
            case "square" -> new Square(10);
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
    }

}
