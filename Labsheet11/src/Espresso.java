package CoffeeShop;

public class Espresso extends Drink implements Priceable {

    private int shot;

    public Espresso(char size) {
        super("Espresso", size, 35);
        shot = 0;
    }

    public void addShot(int amount) {
        shot += amount;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice + (shot * 15) + getSizeExtra();
    }

    @Override
    public String toString() {
        String result = super.toString() + "\n";

        if (shot > 0) {
            result += "Added " + shot + " shot\n";
        }

        result += "Total price = " + calculateFinalPrice() + " Baht";
        return result;
    }
}
