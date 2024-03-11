package AbstractionDemo;

public interface MyInterface {
    void start();
    void run();

    default void myMethod1()
    {
        System.out.println("myMethod1");
    }

    private void myMethod3()
    {
        System.out.println("myMethod3");
    }
    static void myMethod2()
    {
        System.out.println("myMethod2");
    }
}

class ChildInterface implements MyInterface
{
    public void run() // overridden method
    {
        System.out.println("run");
    }
    public void start() // overridden method
    {
        System.out.println("start");
    }
}
