package CollectionsDemo.stackDemo;

import java.util.Stack;

public class StackDemo1 {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();

        s.push("Jey");
        s.push("Amol");
        s.push("Sneha");
        s.push("Sree");
        s.push("Swapnil");

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);


    }
}
