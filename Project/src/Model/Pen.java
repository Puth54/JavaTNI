package Model;

public class Pen extends WritingTool implements Categorizable {

    private double tipSize;

    public Pen(String id, String name, double price,
               int qty, int max, int min,
               boolean status, String color, double tipSize) {

        super(id, name, price, qty, max, min, status, color);
        this.tipSize = tipSize;
    }

    @Override
    public double getTipSize() { return tipSize; }

    @Override
    public String getCategoryName() { return "Writing Tool"; }

    @Override
    public String getStorageZone() { return "Shelf A"; }
}