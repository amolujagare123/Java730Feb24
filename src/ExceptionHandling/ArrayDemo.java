package ExceptionHandling;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 11;
        a[1] = 62;
        a[2] = 23;
        a[3] = 43;
        a[4] = 91;
        a[5] = 31;

        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);


        System.out.println("end of the program");

    }
}
