package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(2);
        queue.offer(26);
        queue.offer(14);
        queue.offer(5);

        System.out.println(queue);

        System.out.println(queue.poll());

        System.out.println(queue.peek());

        System.out.println(queue);
    }
}
