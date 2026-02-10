package CoffeeShop;

public class Drink {

    protected String drinkName;
    protected char size;        // S, M, L
    protected double basePrice;

    public Drink(String drinkName, char size, double basePrice) {
        this.drinkName = drinkName;
        this.size = Character.toUpperCase(size);
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getSizeExtra() {
        switch (size) {
            case 'S': return 0;
            case 'M': return 10;
            case 'L': return 15;
            default: return -1;
        }
    }

    @Override
    public String toString() {
        return "Your order: " + drinkName + " (Size: " + size + ")";
    }
}
