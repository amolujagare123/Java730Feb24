package CollectionsDemo.SetDemo;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeeSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add("anil");
        ts.add("rahul");
        ts.add("rohit");
        ts.add("anuja");
        ts.add("vihan");
        ts.add("sneha");
      /*  ts.add(10);
        ts.add(null);
*/
        System.out.println(ts.add("sneha"));

        System.out.println(ts);
    }
}
