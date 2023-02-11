import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(Arrays.asList("x", "c", "d"));
        System.out.println(queue);
    }
}