package ArraysDemo;

public class ArrayDemo1 {
    public static void main(String[] args) {

        int[] a = new int[5];

        a[0] = 11;
        a[1] = 62;
        a[2] = 23;
        a[3] = 43;
        a[4] = 91;

        System.out.println("length = "+ a.length); // 5

       // System.out.println(a[1]);
/*
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);*/
        // for each loop - data sequential
        for(int x:a)
        {
            System.out.println(x);
        }


    }
}
