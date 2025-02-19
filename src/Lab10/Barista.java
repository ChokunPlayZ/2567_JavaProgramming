package Lab10;

public class Barista {
    private String name;
    private char gender;

    Barista(String name, char gender) {
        this.name = name;
        this.gender = Character.toUpperCase(gender);
    }

    Barista() {
        this(null, ' ');
    }

    public String getName() {
        return name;
    }

    public String getGenderName() {
        if (gender == 'M') return "Male";
        if (gender == 'F') return "Female";
        return " ";
    }

    public String toString() {
        return getName() + " ("+getGenderName()+")";
    }
}
