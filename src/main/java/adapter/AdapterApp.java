package adapter;

public class AdapterApp {

    public static void main(String[] args) {
        CircleHole hole = new CircleHole(10);
        CirclePlug circlePlug = new CirclePlug(10);
        System.out.println("HOLE: 10 | CIRCLE: 10");
        System.out.println(hole.fits(circlePlug));
        SquarePlug squarePlug = new SquarePlug(2);
        SquarePlugAdapterImpl adapter = new SquarePlugAdapterImpl(squarePlug);
        System.out.println("HOLE: 10 | SQUARE: 2");
        System.out.println(hole.fits(adapter));
        SquarePlug squarePlug2 = new SquarePlug(50);
        SquarePlugAdapterImpl adapter2 = new SquarePlugAdapterImpl(squarePlug2);
        System.out.println("HOLE: 10 | SQUARE: 50");
        System.out.println(hole.fits(adapter2));
    }
}
