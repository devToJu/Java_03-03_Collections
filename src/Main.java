import java.util.ArrayList;
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

        System.out.println("Element at Index 1 is " + list.get(1));
    }

    private static void printList() {
        System.out.println(list);
    }

    private static void addElementAt(int index) {
        list.add(index, "a");
    }
}