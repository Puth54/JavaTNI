package Model;

public class Pencil extends WritingTool implements Categorizable {

    private String grade;

    public Pencil(String id, String name, double price,
                  int qty, int max, int min,
                  boolean status, String color, String grade) {

        super(id, name, price, qty, max, min, status, color);
        this.grade = grade;
    }

    @Override
    public double getTipSize() { return 0; }

    public String getGrade() { return grade; }

    @Override
    public String getCategoryName() { return "Writing Tool"; }

    @Override
    public String getStorageZone() { return "Shelf A"; }
}