package ClassNConstructors;

public class MyClass4 {

    int a;
    double d;
    char c;
    String str; // data members

    MyClass4(int a1,double d1, char c1,String str1)
    {
         a = a1;
         d = d1;
         c = c1;
         str = str1;
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


        MyClass4 ob = new MyClass4(90,98.78,'j',"AMOL");
     //   MyClass4 ob = new MyClass4('j',"AMOL",90,98.78);

        ob.display();



    }

}
