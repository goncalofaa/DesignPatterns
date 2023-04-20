package creational.abstract_factory;

public class ModernFurnitureFactory extends FurnitureFactory {
    @Override
    public Furniture createChair() {
        return new ModernChair();
    }

    @Override
    public Furniture createTable() {
        return new ModernTable();
    }
}