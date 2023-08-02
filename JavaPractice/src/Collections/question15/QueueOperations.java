package Collections.question15;

import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.offer(30);
        queue.add(78);
        queue.add(10);
        System.out.println(queue);
        queue.remove();
        queue.poll();
        System.out.println(queue);
    }
}
