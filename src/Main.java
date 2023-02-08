import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    private static final List<String> list = new ArrayList<>();

    // static initializer block
    static {
        Collections.addAll(list, "b" , "c");
    }

    public static void main(String[] args) {
        printList();

        addElementAt(0);
        printList();

        getElementAt(1);
        changeElementAt(2);
        printList();

        removeElementAt(2);
        printList();

        workingWithIndexOf();

        var listWithFirstAndSecondElement = list.subList(0, 2);
        System.out.println("Sublist: " + listWithFirstAndSecondElement);
    }

    private static void workingWithIndexOf() {
        list.addAll(Arrays.asList("c", "a"));
        System.out.println(list);

        var indexOfFirstA = list.indexOf("a");
        System.out.println("First index with 'a': " + indexOfFirstA);

        var indexOfLastA = list.lastIndexOf("a");
        System.out.println("Last index with 'a': " + indexOfLastA);

        var indexOfElementNotInList = list.lastIndexOf("x");
        System.out.println("index element not in list: " + indexOfElementNotInList);
        System.out.println();
    }

    private static void removeElementAt(int index) {
        list.remove(index);
    }

    private static void changeElementAt(int index) {
        list.set(index, "c++");
    }

    private static void getElementAt(int index) {
        var element = list.get(index);
        System.out.println("Element at Index " + index + " is " + element);
    }

    private static void printList() {
        System.out.println(list);
        System.out.println();
    }

    private static void addElementAt(int index) {
        list.add(index, "a");
    }
}