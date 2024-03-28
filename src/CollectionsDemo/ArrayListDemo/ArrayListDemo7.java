package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo7 {

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

     // remove all elements having string with size = 5

        al.removeIf(str -> str.length()==5 ) ;

        System.out.println("al="+al);






    }
}
