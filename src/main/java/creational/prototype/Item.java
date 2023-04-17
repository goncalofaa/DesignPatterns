package creational.prototype;

public abstract class Item implements Cloneable {

    private double price;
    private int id;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
