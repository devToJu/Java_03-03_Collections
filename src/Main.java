import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static Set<String> unsortedUniqueCollection = new HashSet<>();

    static Set<String> setA = new HashSet<>(Arrays.asList("a", "b", "c"));
    static Set<String> setB = new HashSet<>(Arrays.asList("b", "c", "d"));

    public static void main(String[] args) {
        System.out.println(unsortedUniqueCollection);

        addItems();
        removeDuplicateFromList();

        unionTwoSets();
        resetSetA();

        intersectionTwoSets();
        resetSetA();

        differenceTwoSets();
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

    private static void unionTwoSets() {
        System.out.println("\n---- UNION: get all elements as unique ----");
        System.out.println("SetA: " + setA);
        System.out.println("SetB: " + setB);

        setA.addAll(setB);
        System.out.println("Union: " + setA);
    }

    private static void resetSetA() {
        setA = new HashSet<>(Arrays.asList("a", "b", "c"));
    }

    private static void intersectionTwoSets() {
        System.out.println("\n---- INTERSECTION: get elements common in both sets ----");
        System.out.println("SetA: " + setA);
        System.out.println("SetB: " + setB);

        setA.retainAll(setB);
        System.out.println("Intersection: " + setA);
    }

    private static void differenceTwoSets() {
        System.out.println("\n---- DIFFERENCE: get only the unique elements of first set ----");
        System.out.println("SetA: " + setA);
        System.out.println("SetB: " + setB);

        setA.removeAll(setB);
        System.out.println("Difference: " + setA);
    }
}