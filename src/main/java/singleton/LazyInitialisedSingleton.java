package singleton;

public class LazyInitialisedSingleton {

    private static LazyInitialisedSingleton lazyInitialisedSingleton;

    private LazyInitialisedSingleton() {}

    private String name;

    public static synchronized LazyInitialisedSingleton getSingleton() {
        if(lazyInitialisedSingleton == null){
            lazyInitialisedSingleton = new LazyInitialisedSingleton();
        }
        return lazyInitialisedSingleton;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}