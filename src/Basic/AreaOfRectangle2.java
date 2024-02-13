package Basic;

import java.util.Scanner;

public class AreaOfRectangle2 {

    public static void main(String[] args) {

        int length ;
        int breadth ;
        int area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length=");
        length = sc.nextInt();

        System.out.println("Enter the breadth=");
        breadth = sc.nextInt();

        area = length * breadth;

        System.out.println("area="+area);
    }
}
