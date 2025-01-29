package Lab8;

public class Date {
    private int dMonth;
    private int dDay;
    private int dYear;

    Date(int month, int day, int year) {
        dMonth = month;
        dDay = day;
        dYear = year;
    }

    Date() {
        this(0, 0, 0);
    }

    public void setDate(int month, int day, int year) {
        dMonth = month;
        dDay = day;
        dYear = year;
    }

    public int getMonth() {
        return dMonth;
    }

    public int getDay() {
        return dDay;
    }

    public int getYear() {
        return dYear;
    }

    public String toString() {
        return String.format("%02d-%02d-%d", dMonth, dDay, dYear);
    }
}
