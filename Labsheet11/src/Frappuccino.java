package CoffeeShop;

public class Frappuccino extends Drink implements Priceable {

    private boolean whipped;

    public Frappuccino(char size, boolean whipped) {
        super("Frappuccino", size, 40);
        this.whipped = whipped;
    }

    @Override
    public double calculateFinalPrice() {
        double whippedCost = whipped ? 15 : 0;
        return basePrice + whippedCost + getSizeExtra();
    }

    @Override
    public String toString() {
        String result = super.toString() + "\n";

        if (whipped) {
            result += "Add whipped 15 Baht\n";
        }

        result += "Total price = " + calculateFinalPrice() + " Baht";
        return result;
    }
}
