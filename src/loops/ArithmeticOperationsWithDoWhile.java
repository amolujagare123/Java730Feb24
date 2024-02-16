package loops;

import java.util.Scanner;

public class ArithmeticOperationsWithDoWhile {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c;

        String operation ;

        Scanner sc = new Scanner(System.in);


     //   String yesNo="";
        char yesNo;
        do {

            System.out.println("Enter your Operation=");
            operation = sc.nextLine();

            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("Addition=" + c);
                    break;
                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;
                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;
                case "div":
                    c = a / b;
                    System.out.println("Division=" + c);
                    break;

                default:
                    System.out.println("Wrong choice");
                    break;
            }

            System.out.println("Do you want to continue  (y/n) : ");
            yesNo = sc.nextLine().charAt(0);

        } while(yesNo=='y');

    }
}
