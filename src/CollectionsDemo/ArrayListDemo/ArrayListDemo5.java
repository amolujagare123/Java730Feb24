package CollectionsDemo.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo5 {

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

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("abcd1");
        al2.add("abcd2");
        al2.add("abcd3");
        al2.add("abcd4");
        al2.add("abcd5");
        al2.add("Swapnil");
        al2.add("Swati");
        al2.add("gowri");
        al2.add("ganesh");

        System.out.println("al2="+al2);

        al2.removeAll(al);

        System.out.println("al2="+al2);






    }
}
