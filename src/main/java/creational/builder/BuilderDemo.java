package creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        //Not immutable
        PizzaOrderMutable pizzaOrderMutableWithoutBuilder = new PizzaOrderMutable();
        pizzaOrderMutableWithoutBuilder.setSize("medium");
        pizzaOrderMutableWithoutBuilder.setCrust("high");
        pizzaOrderMutableWithoutBuilder.setSauce("tomato sauce");
        pizzaOrderMutableWithoutBuilder.setTopping("cheese");

        System.out.println(pizzaOrderMutableWithoutBuilder.toString());

        pizzaOrderMutableWithoutBuilder.setTopping("ham");

        System.out.println(pizzaOrderMutableWithoutBuilder.toString());

        //Telescoping
        PizzaOrderTelescoping pizzaOrderTelescopingWithoutBuilderNoTopping = new PizzaOrderTelescoping("large","thin","tomato");
        PizzaOrderTelescoping pizzaOrderTelescopingWithoutBuilderNoToppingAndSauce = new PizzaOrderTelescoping("large","thin");

        //Many parameters in the builder, immutable
        System.out.println(pizzaOrderTelescopingWithoutBuilderNoTopping.toString());
        System.out.println(pizzaOrderTelescopingWithoutBuilderNoToppingAndSauce.toString());

        //Builder

        //Add what you need only (no telescoping), immutable, adds complexity
        PizzaOrder pizzaOrderNoTopping = new PizzaOrder.PizzaOrderBuilder()
                .withSauce("tomato")
                .build();

        System.out.println(pizzaOrderNoTopping.toString());

    }
}
