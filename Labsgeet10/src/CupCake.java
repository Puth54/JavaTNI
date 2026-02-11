public class CupCake extends Bakery {

    private String flavor;
    private int piece;

    public CupCake(String flavor, int piece, double pricePerPiece) {
        this.flavor = flavor;
        this.piece = piece;
        this.unitPrice = pricePerPiece;
    }

    public boolean isPackingBox() {
        return piece >= 6;
    }

    public int getBoxNumber() {
        return piece / 6;
    }

    public int getBagNumber() {
        return piece % 6;
    }

    @Override
    public double getPackingCost() {
        return isPackingBox() ? getBoxNumber() * packingCost : 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (unitPrice * piece) + getPackingCost() + (getBagNumber() * 0.5);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCup cake (" + flavor + ")" +
                "\nTotal price of Cup Cake = " + calculateTotalPrice();
    }
}
