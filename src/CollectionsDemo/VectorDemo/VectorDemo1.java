package CollectionsDemo.VectorDemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo1 {


    public static void main(String[] args) {

        Vector<String> v = new Vector<>();

        System.out.println("capacity="+v.capacity()); // 10
        System.out.println("size="+v.size()); //0

        v.add("amol");
        v.add("sneha");
        v.add("Jey");
        v.add("Swapnil");
        v.add("Swati");
        v.add("gowri");
        v.add("ganesh");
        v.add("Dipti");
        v.add("ganesh");
        v.add("Dipti");
        v.add("Dipti");
        v.add("amol");
        v.add("sneha");
        v.add("Jey");
        v.add("Swapnil");
        v.add("Swati");
        v.add("gowri");
        v.add("ganesh");
        v.add("Dipti");
        v.add("ganesh");
        v.add("Dipti");
        v.add("Dipti");

        System.out.println("=======================");
        System.out.println("capacity="+v.capacity()); // 40
        System.out.println("size="+v.size());// 22

        System.out.println(v);
        System.out.println("=======================");
        Iterator itr = v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println("=======================");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
