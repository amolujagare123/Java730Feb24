package CollectionsDemo.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo1 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("amol");
        ll.add("sneha");
        ll.add("Jey");
        ll.add("Swapnil");
        ll.add("Swati");
        ll.add("gowri");
        ll.add("ganesh");
        ll.add("Dipti");
        ll.add("Tanya");
        ll.add("vaishali");

        System.out.println(ll);

        ll.addFirst("First");
        ll.addLast("Last");

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
