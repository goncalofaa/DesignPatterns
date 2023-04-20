package creational.abstract_factory;

// Victorian Furniture Factory class
public class VictorianFurnitureFactory extends FurnitureFactory {
    @Override
    public Furniture createChair() {
        return new VictorianChair();
    }

    @Override
    public Furniture createTable() {
        return new VictorianTable();
    }
}