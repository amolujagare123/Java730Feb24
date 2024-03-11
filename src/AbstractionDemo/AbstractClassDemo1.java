package AbstractionDemo;

public abstract class AbstractClassDemo1 {

    // abstract method
    abstract void run(); // declared
    abstract void start(); // declared

    void display() // non-abstract method  / defined
    {
        System.out.println("this is display");
    }


}

class ChildAbstract extends AbstractClassDemo1
{
   void run() // overridden method
   {
       System.out.println("run");
   }

    void start() // overridden method
    {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractClassDemo1 ob = new ChildAbstract();
        ob.run();
        ob.start();
        ob.display();
    }
}
