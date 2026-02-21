package Model;

public abstract class WritingTool extends Product {

    protected String color;

    public WritingTool(String id, String name, double price,
                       int qty, int max, int min,
                       boolean status, String color) {

        super(id, name, price, qty, max, min, status);
        this.color = color;
    }

    public String getColor() { return color; }

    public abstract double getTipSize();
}