package ClassNConstructors;

public class MyClass5 {

    int a;
    double d;
    char c;
    String str; // data members

    MyClass5(int a, double d, char c, String str)
    {
        this.a = a;
        this.d = d;
        this.c = c;
        this.str = str;
    }

  /*  MyClass4(char c1,String str1,int a1,double d1)
    {
        a = a1;
        d = d1;
        c = c1;
        str = str1;
    }*/
    void display() // member function
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);
    }

    public static void main(String[] args) {


        MyClass5 ob = new MyClass5(90,98.78,'j',"AMOL");
        ob.display();

        MyClass5 ob2 = new MyClass5(10,48.58,'c',"amol123");
        ob2.display();



    }

}
