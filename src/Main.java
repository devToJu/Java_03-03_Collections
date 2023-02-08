import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Tom", "e1"));
        users.add(new User("Jenny", "e4"));
        users.add(new User("Hans", "e3"));
        users.add(new User("Jenna", "e2"));

        System.out.println(users);
        Collections.sort(users);
        System.out.println(users);
    }
}