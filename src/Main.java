import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<String> unsortedUniqueCollection = new HashSet<>();
    public static void main(String[] args) {
        System.out.println(unsortedUniqueCollection);

        addItems();
        System.out.println(unsortedUniqueCollection);
    }

    private static void addItems() {
        unsortedUniqueCollection.add("sky");
        unsortedUniqueCollection.add("is");
        unsortedUniqueCollection.add("blue");
        unsortedUniqueCollection.add("blue");
    }
}