package factory;

public class Square implements Shape {

    private int width;

    public int getWidth() {
        return width;
    }

    public Square(int i) {
        this.width=i;
    }

    @Override
    public int getEdgeCount() {
        return 4;
    }

    @Override
    public Square createSmallerShape() {
        return new Square(width/2);
    }


}
