package creational.abstract_factory;

public class Demo {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();

        Furniture modernChair = modernFactory.createChair();
        Furniture modernTable = modernFactory.createTable();

        Furniture victorianChair = victorianFactory.createChair();
        Furniture victorianTable = victorianFactory.createTable();

        modernChair.assemble(); // Output: Assembling modern chair...
        modernTable.assemble(); // Output: Assembling modern table...

        victorianChair.assemble(); // Output: Assembling Victorian chair...
        victorianTable.assemble(); // Output: Assembling Victorian table...
    }
}
