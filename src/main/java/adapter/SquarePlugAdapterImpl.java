package adapter;

public class SquarePlugAdapterImpl extends CirclePlug implements SquarePlugAdapter{

    SquarePlug squarePlug;

    public SquarePlugAdapterImpl(SquarePlug squarePlug) {
        super(0);
        this.squarePlug = squarePlug;
    }

    @Override
    public int getRadius() {
        return (int) (squarePlug.getWidth() * Math.sqrt(2)/2);
    }
}
