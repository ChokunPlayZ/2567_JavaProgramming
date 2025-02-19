package Lab10;

import java.time.Year;

public class FictionBook implements Book,Author{
    private String author_name;
    private String email;
    private String title;
    private int publicYear;
    private String fname;
    private String lname;

    FictionBook(String title, int publicYear) {
        this.title = title;
        this.publicYear = publicYear;
    }

    public void setAuthorName(String name) {
        this.author_name = name.strip();
        String[] names = this.author_name.split(" ");
        this.fname = names[0];
        this.lname = names[1];
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getLastName() {
        return lname.toUpperCase();
    }

    @Override
    public String getFirstName() {
        return fname.toUpperCase();
    }

    @Override
    public boolean checkEmail() {
        return email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int totalPublicYear() {
        return Year.now().getValue() - publicYear;
    }

    public String toString() {
        return String.format("%s write by %s.%s (%s)\nPublished for %s years.",
                getTitle(), getLastName().charAt(0), getFirstName(), getEmail(), totalPublicYear()
        );
    }
}
