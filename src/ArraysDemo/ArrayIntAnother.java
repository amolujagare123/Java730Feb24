package ArraysDemo;

public class ArrayIntAnother {

    public static void main(String[] args) {


        int[] a = {12,45,67,89,12,34,56,78,90,23};

      /*  for (int i=0;i<a.length;i++)
            System.out.println(a[i]);*/

        for ( int x : a )
            System.out.println(x);

    }
}
