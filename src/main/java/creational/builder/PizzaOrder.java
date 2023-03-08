package creational.builder;

public class PizzaOrder {

    public static class PizzaOrderBuilder {
        private String size;
        private String crust;
        private String sauce;
        private String topping;

        public PizzaOrderBuilder() {
        }

        public PizzaOrder build() {
            return new PizzaOrder(this);
        }

        public PizzaOrderBuilder(String size, String crust) {
            this.size = size;
            this.crust = crust;
        }

        public PizzaOrderBuilder withSauce(String sauce){
            this.sauce=sauce;
            return this;
        }

        public PizzaOrderBuilder withTopping(String topping){
            this.topping=topping;
            return this;
        }

    }

    private final String size;
    private final String crust;
    private final String sauce;
    private final String topping;

    private PizzaOrder(PizzaOrderBuilder pizzaOrderBuilder){
        this.size=pizzaOrderBuilder.size;
        this.crust=pizzaOrderBuilder.crust;
        this.sauce=pizzaOrderBuilder.sauce;
        this.topping=pizzaOrderBuilder.topping;
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
