import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Tom", "e2"));
        users.add(new User("Jenny", "e1"));
        users.add(new User("Hans", "e4"));
        users.add(new User("Jenna", "e3"));

        System.out.printf("%17s", "unsorted: ");
        System.out.println(users);

        Collections.sort(users);
        System.out.printf("%17s", "sorted by name: ");
        System.out.println(users);

        users.sort(new EmailComparator());
        System.out.printf("%17s", "sorted by email: ");
        System.out.println(users);
    }
}