import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<String, User> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(map);
        storeUser();
    }

    private static void storeUser() {
        var userA = new User("Tom", "e1");
        var userB = new User("Tina", "e2");

        map.put(userA.getEmail(), userA);
        map.put(userB.getEmail(), userB);

        System.out.println(map);
    }
}