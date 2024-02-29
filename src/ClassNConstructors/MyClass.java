package ClassNConstructors;

public class MyClass {

    int a;
    double d;
    char c;
    String str; // data members

    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {

        int x ;
        x = 10 ;

     //   a = 89 ;

        MyClass ob = new MyClass();
      //  ob.display();

        ob.a = 89;
        ob.d = 90.89;
        ob.c = 'h';
        ob.str = "AMOL";

        ob.display();

        MyClass ob2 = new MyClass();
        ob2.a = 22;
        ob2.d = 33.89;
        ob2.c = 'f';
        ob2.str = "Sachin";
        ob2.display();
    }

}
