package CollectionsDemo.SetDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add("anil");
        lhs.add("rahul");
        lhs.add("rohit");
        lhs.add("anuja");
        lhs.add("vihan");
        lhs.add("sneha");
        lhs.add(10);
        lhs.add(null);

        System.out.println(lhs.add("sneha"));

        System.out.println(lhs);
    }
}
