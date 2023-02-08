import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Tom"));
        users.add(new User("Jenny"));
        users.add(new User("Hans"));
        users.add(new User("Jenna"));

        // Compilation error: user doesn't implement the comparable interface
        // Collections.sort(users);
    }
}