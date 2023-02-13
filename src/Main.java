import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    static Queue<String> queue = new ArrayDeque<>(Arrays.asList("x", "c", "d"));
    public static void main(String[] args) {
        addItemsAtTheRear();
        queueWithLimitedSize();

        // Get front item of the queue
        var frontItem = queue.peek();
        System.out.println(frontItem);
        System.out.println(queue);

        frontItem = queue.element();
        System.out.println(frontItem);
        System.out.println(queue);
    }

    private static void addItemsAtTheRear() {
        System.out.println(queue);

        queue.add("rear");
        queue.offer("another rear");
        System.out.println(queue);
    }
    private static void queueWithLimitedSize() {
        Queue<String> queue = new ArrayBlockingQueue<>(2, true, Arrays.asList("a", "b"));

        try {
            queue.add("c");
        }
        catch (IllegalStateException ex) {
            System.out.println("Queue is full");
        }

        if (!queue.offer("c")) {
            System.out.println("Queue is full");
        }
    }
}