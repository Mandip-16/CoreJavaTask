package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnedPriorityQueue {

    public static void main(String[] args) {
//        Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());

        queue.offer(34);
        queue.offer(2);
        queue.offer(13);
        queue.offer(50);
        queue.offer(6);

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
