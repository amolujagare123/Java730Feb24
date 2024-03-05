package Inheritance.HybridInheritance;


class Animal {
    void eat()
    {
        System.out.println("eat");
    }
}

class Reptile extends Animal {
    void crawl()
    {
        System.out.println("crawl");
    }
}

class Mamal extends Animal {
    void walk()
    {
        System.out.println("walk");
    }
}

class Tiger extends Mamal  {
    void roar()
    {
        System.out.println("roar");
    }
}

public class TestHyBridInheritance {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Reptile r = new Reptile();
        r.eat();
        r.crawl();

        Mamal m = new Mamal();
        m.eat();
        m.walk();

        Tiger t = new Tiger();
        t.roar();
        t.walk();
        t.eat();
    }
}
