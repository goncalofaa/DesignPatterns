package singleton;

public class SingletonApplication {

    public static void main(String[] args) {
        LazyInitialisedSingleton singleton1 = LazyInitialisedSingleton.getSingleton();
        LazyInitialisedSingleton singleton2 = LazyInitialisedSingleton.getSingleton();
        System.out.println(singleton2.equals(singleton1));
        singleton1.setName("Carlos");
        System.out.println(singleton2.getName());
    }
}
