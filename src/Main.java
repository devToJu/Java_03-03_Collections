import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    static Queue<String> queue = new ArrayDeque<>(Arrays.asList("x", "c", "d"));
    public static void main(String[] args) {
        System.out.println("----- Add items at the rear -----");
        addItemsAtTheRear();

        System.out.println("\n----- Add items to limited size -----");
        queueWithLimitedSize();

        System.out.println("\n----- Get front item -----");
        getFrontItem();

        System.out.println("\n----- Get item from empty queue-----");
        getItemFromEmptyQueue();
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
    private static void getFrontItem() {
        var frontItem = queue.peek();
        System.out.println(frontItem);
        System.out.println(queue);

        frontItem = queue.element();
        System.out.println(frontItem);
        System.out.println(queue);
    }
    private static void getItemFromEmptyQueue() {
        Queue<String> emptyQueue = new ArrayDeque<>();
        var item  = "TEST";

        item = emptyQueue.peek();
        if (item == null)
            System.out.println("Queue is empty => Item is null");

        item = "TEST";

        try {
            item = emptyQueue.element();
        }
        catch (NoSuchElementException ex) {
            System.out.println("Queue is empty => Item is " + item);
        }
    }
}