package Lab9;

public class Director {
    private String name;
    private String email;
    private char gender;

    Director (String name, String email, char gender) {
        this(name,email);
        this.gender = gender;
    }

    Director (String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGenderName() {
        if (Character.toLowerCase(gender) == 'm') return "Male";
        if (Character.toLowerCase(gender) == 'f') return "Female";
        return null;
    }

    public String toString() {
        return String.format("%s (%s;%s)", getName(), getEmail(), getGenderName());
    }
}
