public class User implements Comparable<User> {
    private final String name;

    private final String email;

    public static final User DEFAULT_USER = new User("default user", "default email");

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(User other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
