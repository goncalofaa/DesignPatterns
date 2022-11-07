package factory;

public interface Shape {

    int getEdgeCount();

    Shape createSmallerShape();
}
