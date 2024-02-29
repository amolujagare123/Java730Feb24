package ClassNConstructors;

public class MyClass3 {

    int a;
    double d;
    char c;
    String str; // data members

    MyClass3()
    {
         a = 33;
         d = 34.56;
         c = 'a';
         str = "selenium";
    }
    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClass3 ob = new MyClass3();
        ob.display();

       /* ob.a = 89;
        ob.d = 90.89;
        ob.c = 'h';
        ob.str = "AMOL";

        ob.display();*/

    }

}
