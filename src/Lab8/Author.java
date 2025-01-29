package Lab8;

public class Author {
    private String name;
    private String email;

    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    Author() {
        this(null, null);
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return name + " (" + email + ")";
    }
}
