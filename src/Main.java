import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(Arrays.asList("x", "c", "d"));
        System.out.println(queue);

        queue.add("rear");
        queue.offer("another rear");
        System.out.println(queue);

        queueWithLimitedSize();
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