package Queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(5);
        adq.offer(27);

        System.out.println(adq);

        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.peek());

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);
        System.out.println(adq.size());
    }
}
