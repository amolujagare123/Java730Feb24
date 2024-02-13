package ControlStructure;

public class ArithmeticOperations2 {

    public static void main(String[] args) {

        // print tables 11 to 15


       int a =  13;

        switch (a)
        {
            case 11 :  for (int i=11;i<=110;i=i+11)
                System.out.println(i);
                break;
            case 12 :  for (int i=12;i<=120;i=i+12)
                System.out.println(i);
                break;
            case 13 :  for (int i=13;i<=130;i=i+13)
                System.out.println(i);
                break;
            case 14 :  for (int i=14;i<=140;i=i+14)
                System.out.println(i);
                break;
            case 15 :  for (int i=15;i<=150;i=i+15)
                System.out.println(i);
                break;


            default:
                System.out.println("Wrong choice");
                break;
        }

    }
}
