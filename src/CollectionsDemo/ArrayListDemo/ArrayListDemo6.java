package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

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

        System.out.println("al="+al);

        /*al.remove(5);
        System.out.println("al="+al);*/

        al.remove("Dipti");
        System.out.println("al="+al);








    }
}
