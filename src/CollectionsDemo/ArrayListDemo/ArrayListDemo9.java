package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo9 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(23);
        al.add(45);
        al.add(12);
        al.add(67);
        al.add(89);
        al.add(34);
        al.add(56);
        al.add(78);
        al.add(90);
        al.add(21);


        System.out.println("al="+al);

        // 1. remove all elements which are odd numbers
        // 2. remove all elements which less than 50

     //   al.removeIf(num -> num%2!=0 ) ;
        al.removeIf(num -> num < 50 ) ;

        System.out.println("al="+al);






    }
}
