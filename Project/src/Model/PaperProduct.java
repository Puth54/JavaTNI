package Model;

public abstract class PaperProduct extends Product {

    protected String size;
    protected int gsm;

    public PaperProduct(String id, String name, double price,
                        int qty, int max, int min,
                        boolean status, String size, int gsm) {

        super(id, name, price, qty, max, min, status);
        this.size = size;
        this.gsm = gsm;
    }

    public String getSize() { return size; }
    public int getGSM() { return gsm; }
}