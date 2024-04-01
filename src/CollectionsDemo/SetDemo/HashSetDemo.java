package CollectionsDemo.SetDemo;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add("anil");
        hs.add("rahul");
        hs.add("rohit");
        hs.add("anuja");
        hs.add("vihan");
        hs.add("sneha");
        hs.add(10);
        hs.add(null);

        System.out.println(hs.add("sneha"));

        System.out.println(hs);
    }
}
