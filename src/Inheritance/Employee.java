package Inheritance;

public class Employee {
    int salary = 30000;
}

class Programmer  extends Employee
{
    int bonus = 20000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus);
        System.out.println(p.salary);
    }
}
