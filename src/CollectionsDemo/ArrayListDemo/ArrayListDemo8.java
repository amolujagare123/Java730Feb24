package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo8 {

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

     // remove all elements having 'n' in it

        al.removeIf( str -> str.contains("n") ) ;

        System.out.println("al="+al);






    }
}
