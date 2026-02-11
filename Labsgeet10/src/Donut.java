public class Donut extends Bakery {

    private String glaze;
    private int pieces;

    public Donut(String glaze, int pieces, double pricePerPiece) {
        this.glaze = glaze;
        this.pieces = pieces;
        this.unitPrice = pricePerPiece;
    }

    public boolean isPartyBox() {
        return pieces >= 12;
    }

    @Override
    public double getPackingCost() {
        return isPartyBox() ? 20 : 5;
    }

    @Override
    public double calculateTotalPrice() {
        return (unitPrice * pieces) + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nDonut (" + glaze + ") x " + pieces
                + "\nTotal price of Donut = " + calculateTotalPrice();
    }
}
