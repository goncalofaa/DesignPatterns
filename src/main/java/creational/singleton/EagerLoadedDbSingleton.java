package creational.singleton;

public class EagerLoadedDbSingleton {

    //    Eager Loading
    //    Initializes or loads a resource as soon as the code is executed.
    //    Eager loading also involves pre-loading related entities referenced by a resource.

    private static EagerLoadedDbSingleton instanceEagerLoaded = new EagerLoadedDbSingleton();

    private EagerLoadedDbSingleton() {}

    public static EagerLoadedDbSingleton getInstance() {
        return instanceEagerLoaded;
    }
}
