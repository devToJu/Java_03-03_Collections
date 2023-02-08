import java.util.Comparator;

public class EmailComparator implements Comparator<User> {
    @Override
    public int compare(User user, User other) {
        return user.getEmail().compareTo(other.getEmail());
    }
}
