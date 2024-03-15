package FinalNStatic;

public class StudentDemo {
    public int rno;
    public String name ;
    public static String college="ITC";
    public void display() // non- static
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static  void staticMethod1()
    {
       // System.out.println("rno="+rno); // non-static - not allowed
       // System.out.println("name="+name); // non-static - not allowed
        System.out.println("college="+college); // static - allowed
        System.out.println("My static method 1");
        staticMethod2(); // static - allowed
      //  nonStaticMethod(); // non-static - not allowed
       // display(); // non-static - not allowed

    }

    public static  void staticMethod2()
    {
        System.out.println("My static method 2");
    }

    public void nonStaticMethod()
    {
        System.out.println("My non static method ");
        System.out.println("rno="+rno); // non-static -  allowed
        System.out.println("name="+name); // non-static -  allowed
        System.out.println("college="+college); // static - allowed
        System.out.println("My static method 1");
        staticMethod2(); // static - allowed
        nonStaticMethod(); // static - not allowed
        display(); // static - not allowed
    }

    public static void main(String[] args) {

        StudentDemo sd = new StudentDemo();

        //Static methods is called using class objects

        sd.staticMethod1();
        sd.staticMethod2();

        //Static methods is called using class name

        StudentDemo.staticMethod1();
        StudentDemo.staticMethod2();

    }
}
