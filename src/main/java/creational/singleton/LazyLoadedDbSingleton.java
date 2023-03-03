package creational.singleton;

public class LazyLoadedDbSingleton {

    //    Lazy Loaded
    //    Lazy loading is the practice of delaying load or initialization of resources or
    //    objects until they’re actually needed to improve performance and save system resources.

    private static LazyLoadedDbSingleton instanceLazyLoaded = null;

    private LazyLoadedDbSingleton() {
        if (instanceLazyLoaded != null) {
            throw new RuntimeException("Use get instance() method to create");
        }
    }

    public static LazyLoadedDbSingleton getInstance() {
        if (instanceLazyLoaded == null) {
            synchronized (LazyLoadedDbSingleton.class) {
                if( instanceLazyLoaded == null) {
                    instanceLazyLoaded = new LazyLoadedDbSingleton();
                }
            }
        }
        return instanceLazyLoaded;
    }
}
