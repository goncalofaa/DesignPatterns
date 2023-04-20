package creational.abstract_factory;

public class Chair extends Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling chair...");
    }
}
