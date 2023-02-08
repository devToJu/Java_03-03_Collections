import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static List<String> list = new ArrayList<>();

    // static initializer block
    static {
        Collections.addAll(list, "b" , "c");
    }

    public static void main(String[] args) {
        System.out.println(list);
        list.add(0, "a");
        System.out.println(list);
    }
}