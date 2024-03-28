package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty()); // true

        al.add("amol");
        al.add("sneha");
        al.add("Jey");
        al.add("Swapnil");
        al.add("Swati");
        al.add("gowri");
        al.add("ganesh");
        al.add("Dipti");
        al.add("Tanya");
        al.add("vaishali");

        System.out.println(al.isEmpty()); // false

        System.out.println(al);

        al.clear();

        System.out.println(al);

       // System.out.println(al.get(6));
        System.out.println("size="+al.size());
        System.out.println("Using for loop...");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        System.out.println("Using for each loop...");

        for(String str:al)
            System.out.println(str);

        System.out.println("Using Iterator...");
        Iterator itr = al.iterator();

        while (itr.hasNext())
            System.out.println(itr.next());




    }
}
