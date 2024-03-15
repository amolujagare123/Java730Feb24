package FinalNStatic.Demo;

import FinalNStatic.StudentDemo;

import static FinalNStatic.StudentDemo.*;
/*import static FinalNStatic.StudentDemo.staticMethod1;
import static FinalNStatic.StudentDemo.staticMethod2;
import static FinalNStatic.StudentDemo.college;*/

public class DemoClass {

   /* void demoMethod()
    {
        StudentDemo.staticMethod1();
        StudentDemo.staticMethod2();
    }*/

    public static void main(String[] args) {

        StudentDemo.staticMethod1();
        StudentDemo.staticMethod2();


        staticMethod1();
        staticMethod2();

        college = "ABCD";
    }
}
