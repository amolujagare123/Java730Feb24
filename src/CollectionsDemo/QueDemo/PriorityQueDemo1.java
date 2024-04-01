package CollectionsDemo.QueDemo;

import java.util.PriorityQueue;

public class PriorityQueDemo1 {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(34);
        pq.offer(14);
        pq.offer(22);
        pq.offer(44);
        pq.offer(77);
        pq.offer(11);
        pq.offer(94);

        // 11 , 14 , 22 , 34  , 44 , 77 , 94

        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());


    }
}
