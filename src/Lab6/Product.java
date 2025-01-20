package Lab6;

public class Product {
    private String name;
    private double price;
    private double taxRate;

    public void setProductDetails(String pName, double pPrice, double pVatRate) {
        name = pName;
        price = pPrice;
        taxRate = pVatRate;
    }

    public double calculateTotalPrice() {
        return price + (100 / (100 + taxRate) * price);
    }

    public void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
        System.out.println("Product Tax Rate: " + taxRate);
        System.out.println("Total Price: " + calculateTotalPrice());
    }
}
