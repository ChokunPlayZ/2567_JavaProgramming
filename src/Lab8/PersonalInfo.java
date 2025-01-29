package Lab8;

public class PersonalInfo {
    private Person name;
    private Date bDay;
    private int personID;

    PersonalInfo(String first, String last, int month, int day, int year, int ID) {
        name = new Person(first, last);
        bDay = new Date(month, day, year);
        personID = ID;
    }

    PersonalInfo() {
        this(null, null, 0, 0, 0, 0);
    }

    public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
        name = new Person(first, last);
        bDay.setDate(month, day, year);
        personID = ID;
    }

    public String toString() {
        return "Name: " + name.toString() + "\nDate of birth: " + bDay + "\nPersonal ID: " + personID;
    }
}
