import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<String> unsortedUniqueCollection = new HashSet<>();
    public static void main(String[] args) {
        System.out.println(unsortedUniqueCollection);

        addItems();
        removeDuplicateFromList();
    }

    private static void addItems() {
        unsortedUniqueCollection.add("sky");
        unsortedUniqueCollection.add("is");
        unsortedUniqueCollection.add("blue");
        unsortedUniqueCollection.add("blue");

        System.out.println(unsortedUniqueCollection);
    }

    private static void removeDuplicateFromList() {
        var list = new ArrayList<>(Arrays.asList("a", "b", "b", "c", "d", "d"));
        unsortedUniqueCollection.addAll(list);

        System.out.println(unsortedUniqueCollection);
    }
}