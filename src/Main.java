import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        addItemsSeparately();
        addMultipleItemsInOneStep();
        getNumberOfItems();
        removeOneItem();
        removeAllItems();
        checkingACollection();
        convertCollectionToArray();
        compareTwoCollections();
    }

    private static <T> void displayAllItems(Collection<T> collection) {
        // Using a foreach-Loop
        for (var item : collection) {
            System.out.println(item);
        }

        // Using the overwritten toString()-Method
        System.out.println(collection);
        System.out.println();
    }

    private static void compareTwoCollections() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "A", "B", "C");

        Collection<String> other = new ArrayList<>(collection);

        System.out.println("Collections have the same referenz: " + (collection == other));
        System.out.println("Collections have the same content: " + (collection.equals(other)));
    }

    private static void convertCollectionToArray() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "A", "B", "C");

        var objectArray = collection.toArray();
        System.out.println("Number of items: " + objectArray.length + " | Items = " + Arrays.toString(objectArray));

        var stringArray = collection.toArray(new String[0]);
        System.out.println("Number of items: " + stringArray.length + " | Items = " + Arrays.toString(stringArray));
        System.out.println();
    }

    private static void checkingACollection() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "A", "B", "C");

        var hasElements = !collection.isEmpty();
        System.out.println("Collection has elements: " + hasElements);

        var containsLetter = collection.contains("B");
        System.out.println("Collection contains letter 'B': " + containsLetter);
        System.out.println();
    }

    private static void removeAllItems() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "A", "B", "C");
        collection.clear();

        displayAllItems(collection);
    }

    private static void removeOneItem() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "A", "B", "C");
        collection.remove("A");

        displayAllItems(collection);
    }

    private static void getNumberOfItems() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "A", "B", "C");
        System.out.println("Count of elements in the collection: " + collection.size());
        System.out.println();
    }

    private static void addMultipleItemsInOneStep() {
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "A", "B", "C");

        displayAllItems(collection);
    }

    private static void addItemsSeparately() {
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");

        displayAllItems(collection);
    }
}