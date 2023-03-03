package creational.singleton;

public class DbSingletonDemo {

    public static void main(String[] args) {

        System.out.println("_______LAZY_LOADED________");
        LazyLoadedDbSingleton dbSingleton = LazyLoadedDbSingleton.getInstance();
        System.out.println("First Instance:");
        System.out.println(dbSingleton);
        LazyLoadedDbSingleton dbSingletonAnother = LazyLoadedDbSingleton.getInstance();
        System.out.println("Second Instance:");
        System.out.println(dbSingletonAnother);
        System.out.println("They are the same instance");

        System.out.println("_______EAGER_LOADED________");
        System.out.println("First Instance");
        System.out.println(EagerLoadedDbSingleton.getInstance());
        System.out.println("Second Instance");
        System.out.println(EagerLoadedDbSingleton.getInstance());
        System.out.println("They are the same instance");
    }
}
