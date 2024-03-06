package Inheritance.Polymorphism;

class Employee {

    Employee()
    {
        System.out.println("Employee Constructor");
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

class Programmer   extends Employee
{

    Programmer()
    {

        System.out.println("Programmers Constructor");
    }


    int bonus = 20000;
    int salary = 5000;
    void programmerWork()
    {
        System.out.println("programmer Work");
    }

    @Override
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

        Employee  e = new Programmer() ; // upcasting
        e.calculateSalary(); // refers to programmers method


    }
}
