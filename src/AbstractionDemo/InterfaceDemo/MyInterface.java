package AbstractionDemo.InterfaceDemo;

public interface MyInterface {
    void start();
    void run();

    void display();
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

interface AnotherInterface
{
    void display();
}

class ChildInterface implements MyInterface , AnotherInterface
{
    public void run() // overridden method
    {
        System.out.println("run");
    }

    @Override
    public void display() {
        System.out.println("this is display");
    }

    public void start() // overridden method
    {
        System.out.println("start");
    }


    public static void main(String[] args) {

        MyInterface ob  = new ChildInterface();

        ob.display();
    }
}
