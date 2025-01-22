package Lab7;

public class DemoCar {
    public static void main(String[] args) {
        Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);

        System.out.println("Company name: " + car.getcompanyName());
        System.out.println("Model name: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());

        System.out.println("\nUpdated Car Details:");

        car.setcompanyName("Toyota");
        System.out.println("Company name: " + car.getcompanyName());
        car.setModelName("Corolla");
        System.out.println("Model name: " + car.getModelName());
        car.setYear(2015);
        System.out.println("Year: " + car.getYear());
        car.setYear(1000);
        car.setcompanyName("");
        car.setModelName("");



    }
}
