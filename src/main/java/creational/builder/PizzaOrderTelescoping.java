package creational.builder;

public class PizzaOrderTelescoping {

    private String size;
    private String crust;
    private String sauce;
    private String topping;

    public PizzaOrderTelescoping(String size, String crust) {
        this.size = size;
        this.crust = crust;
    }

    public PizzaOrderTelescoping(String size, String crust, String sauce) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
    }

    public PizzaOrderTelescoping(String size, String crust, String sauce, String topping) {
        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.topping = topping;
    }

    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }
}
