package Lab9;

public class Theater extends Movie{
    private int theaterNo;

    Theater(String id, String name, Director director, int theaterNo) {
        super(id, name, director);
        this.theaterNo = theaterNo;
    }

    Theater() {
        this.theaterNo = 0;
    }

    public String getTheaterName() {
        if (theaterNo == 15) return "Premium Theater";
        if ((theaterNo >= 12) && (theaterNo <= 14) ) return "Sweet Theater";
        if ((theaterNo >= 1) && (theaterNo <= 11) ) return "Basic Theater";
        return null;
    }

    public String toString() {
        return String.format("%s: %s", getTheaterName(), super.toString());
    }
}
