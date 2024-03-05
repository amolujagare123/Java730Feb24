package Inheritance;

class Bird
{
    void fly()
    {
        System.out.println("fly");
    }
}

class Sparrow extends Bird
{
    void sparrowColor()
    {
        System.out.println("Yellow");
    }
}

class Crow extends Bird
{
    void crowColor()
    {
        System.out.println("Black");
    }
}

public class TestHireacicalInheritance {

    public static void main(String[] args) {
        Bird ob = new Bird();
        ob.fly();

        Sparrow s = new Sparrow();
        s.fly();
        s.sparrowColor();

        Crow c = new Crow();
        c.crowColor();
        c.fly();
    }


}
