public class BirthdayCake extends Bakery {

    private String message;
    private String flavor;
    private int pound;

    public BirthdayCake(String message, String flavor, int pound, double pricePerPound) {
        this.message = message;
        this.flavor = flavor;
        this.pound = pound;
        this.unitPrice = pricePerPound;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public double getPackingCost() {
        return pound >= 3 ? 10 : packingCost;
    }

    @Override
    public double calculateTotalPrice() {
        return (unitPrice * pound) + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n" + flavor + " birthday cake (message=" + message + ")" +
                "\nTotal price of Birthday Cake = " + calculateTotalPrice();
    }
}
