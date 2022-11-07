package adapter;

public class CircleHole {

    private int radius;

    public CircleHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(CirclePlug circlePlug){
        return (circlePlug.getRadius() <= radius);
    }
}
