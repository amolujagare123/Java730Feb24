package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListRemoveInt {

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

        //al.remove(78);

     //   al.remove(new Integer(78));

        Integer ii = 78;
        al.remove(ii);

        System.out.println("al="+al);




    }
}
