package singleton;

public class StaticInitialisedSingleton {

    private static StaticInitialisedSingleton staticInitalisedSingleton;

    private StaticInitialisedSingleton() {}

    //static block is always called before a constructor
    //if a class is instantiated multiple times static block is called only once
    static{
        staticInitalisedSingleton = new StaticInitialisedSingleton();
        System.out.println("static block is called");
    }

    public static StaticInitialisedSingleton getStaticInitalisedSingleton() {
        return staticInitalisedSingleton;
    }
}