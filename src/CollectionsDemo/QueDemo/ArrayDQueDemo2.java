package CollectionsDemo.QueDemo;

import java.util.ArrayDeque;

public class ArrayDQueDemo2 {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(34);
        adq.offer(14);
        adq.offer(22);
        adq.offer(44);
        adq.offer(77);
        adq.offer(11);
        adq.offer(94);

        System.out.println(adq);

      adq.addFirst(0);
      adq.addLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);
    }
}
