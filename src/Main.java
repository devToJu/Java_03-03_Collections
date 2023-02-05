import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        displayAllItems(collection);
    }

    private static <T> void displayAllItems(Collection<T> collection) {
        // Using a foreach-Loop
        for (var item : collection) {
            System.out.println(item);
        }

        // Using the overwritten toString()-Method
        System.out.println(collection);
    }
}