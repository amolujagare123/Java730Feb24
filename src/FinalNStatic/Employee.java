package FinalNStatic;

public final class Employee {
    int salary = 30000;
    /*final*/ void calculateSalary()
    {
        System.out.println("Salary Calculated Based on employee attendance");
    }
}

class Programmer // extends Employee
{
    int bonus = 20000;
    void calculateSalary()
    {
        System.out.println("Salary Calculated Based on programmers attendance");
    }
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println(p.bonus);
   //     System.out.println(p.salary);
    }
}
