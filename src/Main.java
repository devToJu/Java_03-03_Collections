import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<String, User> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("---- store users ----");
        System.out.println(map);
        storeUsers();

        System.out.println("\n---- get user ----");
        getUser();
        getUserNotExist();
        getUserOrDefault();

        System.out.println("\n---- map contains ----");
        mapContainsUser();

        System.out.println("\n---- replace user ----");
        replaceUser();

        System.out.println("\n---- iterate through map ----");
        iterateThroughMapWithKeySet();
    }

    private static void storeUsers() {
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

    private static void mapContainsUser() {
        System.out.println(map);

        if (map.containsKey("e3")) {
            System.out.println("user existiert bereits");
            return;
        }

        map.put("e3", new User("Mary", "e3"));
        System.out.println(map);
    }

    private static void replaceUser() {
        System.out.println(map);

        if (map.containsKey("e3")) {
            var newUser = new User("Marc", "e3");
            System.out.println("replaced user: "+ map.replace("e3", newUser));
        }

        System.out.println(map);
    }

    private static void iterateThroughMapWithKeySet() {
        System.out.println("use keySet():");

        for (var key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        System.out.println("-------------------------------------");
    }
}