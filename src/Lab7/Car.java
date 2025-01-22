package Lab7;

public class Car {
    private String companyName;
    private String modelName;
    private int year;
    private double mileage;

    Car() {
        this("Unknown", "Unknown", 2000, 0.0);
    }

    Car(String companyName, String modelName, int year, double mileage) {
        this.companyName = companyName;
        this.modelName = modelName;
        this.year = year < 1886 ? 2000 : year;
        this.mileage = mileage;
    }
    
    public void setcompanyName(String companyName) {
        if (companyName.strip().equals("")) {
            System.out.println("Error: Invalid company or model name!");
            return;
        }
        this.companyName = companyName;
    }
    
    public String getcompanyName() {
        return companyName;
    }
    
    public void setModelName(String modelName) {
        if (modelName.strip().equals("")) {
            System.out.println("Error: Invalid company or model name!");
            return;
        }
        this.modelName = modelName;
    }
    
    public String getModelName() {
        return modelName;
    }
    
    public void setYear(int year) {
        if (year < 1886) {
            System.out.println("Error: Invalid year!");
            return;
        }
        this.year = year;
    }
    
    public int getYear() {
        return year;
    }
    
    public double getMileage() {
        return mileage;
    }
}
