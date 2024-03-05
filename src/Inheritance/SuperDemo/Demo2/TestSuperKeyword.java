package Inheritance.SuperDemo.Demo2;

class Employee {

    Employee()
    {
        System.out.println("Employee Constructor");
    }
    Employee(int a)
    {
        System.out.println("a="+a);

    }
    Employee(String str)
    {
        System.out.println("str="+str);

    }
    int salary = 30000;
    void empWork()
    {
        System.out.println("emp Work");
    }
    void calculateSalary()
    {
        System.out.println("Salary Calculated Based on employee attendance");
    }
}

class Programmer  extends Employee
{

    Programmer()
    {
        super("Selenium");
        System.out.println("Programmers Constructor");
    }


    int bonus = 20000;
    int salary = 5000;
    void programmerWork()
    {
        System.out.println("programmer Work");
    }

    void calculateSalary()
    {
        System.out.println("Salary Calculated Based on programmers attendance");
    }

    void testMethodCall()
    {
        System.out.println("salary="+super.salary);
        super.calculateSalary();

    }

}


public class TestSuperKeyword
{
    public static void main(String[] args) {
        Programmer p = new Programmer();


    }
}
