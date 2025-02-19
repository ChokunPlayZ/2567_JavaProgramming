package Lab10;

public class Coffee extends Drink{
    private int typeCoffee;
    private char sizeCoffee;
    private Barista barista;

    Coffee(int type, char sizeCoffee, int typeCoffee, Barista barista) {
        super(type, ' ');
        this.typeCoffee = typeCoffee;
        this.sizeCoffee = Character.toUpperCase(sizeCoffee);
        this.barista = barista;
    }

    Coffee(int type, int typeCoffee) {
        this(type, ' ', typeCoffee, null);
    }

    public Barista getBarista() {
        return barista;
    }

    public String getTypeName() {
        if (typeCoffee == 1) return "Americano";
        if (typeCoffee == 2) return "Expresso";
        if (typeCoffee == 3) return "Cappuccino";
        return null;
    }

    public int getTypePrice() {
        if (typeCoffee == 1) return 50;
        if (typeCoffee == 2) return 55;
        if (typeCoffee == 3) return 65;
        return 0;
    }

    public String getSizeName() {
        if (sizeCoffee == 'S') return "Short";
        if (sizeCoffee == 'T') return "Tall";
        if (sizeCoffee == 'G') return "Grande";
        if (sizeCoffee == 'V') return "Venti";
        return null;
    }

    public int getSizePrice() {
        if (sizeCoffee == 'S') return 100;
        if (sizeCoffee == 'T') return 150;
        if (sizeCoffee == 'G') return 200;
        if (sizeCoffee == 'V') return 250;
        return 0;
    }

    public int getTotalPrice() {
        return getTypePrice() + getSizePrice() + super.getTypePrice();
    }

    public String toString() {
        return String.format("%s %s (%s) is %s baht",
                super.getTypeName() ,getTypeName(), getSizeName(), getTotalPrice());
    }
}
