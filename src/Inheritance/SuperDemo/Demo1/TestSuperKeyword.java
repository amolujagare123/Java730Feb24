package Inheritance.SuperDemo.Demo1;

class Employee {
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
    int bonus = 20000;
    int salary = 5000;
//    int salary = 30000;
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
       //  empWork();

    }

}

class Tester extends Programmer
{
    int salary = 7000;

    void testMethodCall2()
    {
        System.out.println("salary="+super.salary);
    }
}

public class TestSuperKeyword
{
    public static void main(String[] args) {
        Programmer p = new Programmer();

        p.testMethodCall();

        Tester t = new Tester();
        t.testMethodCall2();
    }
}
