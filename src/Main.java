import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<String, User> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(map);
        storeUser();

        getUser();
        getUserNotExist();
        getUserOrDefault();
    }

    private static void storeUser() {
        var userA = new User("Tom", "e1");
        var userB = new User("Tina", "e2");

        map.put(userA.getEmail(), userA);
        map.put(userB.getEmail(), userB);

        System.out.println(map);
    }

    private static void getUser() {
        var user = map.get("e2");
        System.out.println(user);
    }

    private static void getUserNotExist() {
        var user = map.get("e99");
        if (user == null)
            System.out.println("User not in map");
    }

    private static void getUserOrDefault() {
        var user = map.getOrDefault("e99", User.DEFAULT_USER);
        System.out.println(user);
    }
}