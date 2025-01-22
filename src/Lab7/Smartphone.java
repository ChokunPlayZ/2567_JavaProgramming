package Lab7;

public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private int MAX_STORAGE_CAPACITY = 512;

    public Smartphone() {
        this("Unknown", "Unknown", 0);
    }

    public Smartphone(String brand, String model, int storageCapacity) {
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity < 0 ? 0 : (storageCapacity > MAX_STORAGE_CAPACITY ? MAX_STORAGE_CAPACITY : storageCapacity);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.strip().length() < 2) {
            System.out.println("Error: Brand must have at least 2 characters!");
            return;
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.strip().length() < 2) {
            System.out.println("Error: Model must have at least 2 characters!");
            return;
        }
        this.model = model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity < 1 || storageCapacity > MAX_STORAGE_CAPACITY) {
            System.out.println("Error: Storage capacity must be between 1 and 512GB!");
            return;
        }
        this.storageCapacity = storageCapacity;
    }

    public void increaseStorage(int additionalStorage) {
        if (storageCapacity + additionalStorage > MAX_STORAGE_CAPACITY) {
            System.out.println("Error: Storage capacity cannot exceed "+MAX_STORAGE_CAPACITY+"GB!");
            return;
        }
        if (additionalStorage < 1) {
            System.out.println("Error: Additional storage must be positive!");
            return;
        }
        storageCapacity += additionalStorage;
    }

    public int getRemainingStorage(int usedStorage) {
        if (usedStorage < 0 || usedStorage > storageCapacity) {
            System.out.println("Error: Used storage must be between 0 and "+storageCapacity+"GB!");
            return -1;
        }
        return storageCapacity - usedStorage;
    }

    public void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
    }

}
