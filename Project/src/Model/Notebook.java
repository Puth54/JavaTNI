package Model;

public class Notebook extends PaperProduct implements Categorizable {

    public Notebook(String id, String name, double price,
                    int qty, int max, int min,
                    boolean status, String size, int gsm) {

        super(id, name, price, qty, max, min, status, size, gsm);
    }

    @Override
    public String getCategoryName() { return "Paper Product"; }

    @Override
    public String getStorageZone() { return "Shelf B"; }
}