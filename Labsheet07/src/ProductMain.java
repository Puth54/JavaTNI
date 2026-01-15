import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {

        Product product = new Product();

        product.name = JOptionPane.showInputDialog("Enter product name:");
        product.price = Double.parseDouble(
                JOptionPane.showInputDialog("Enter product price:")
        );
        product.quantity = Integer.parseInt(
                JOptionPane.showInputDialog("Enter product quantity:")
        );

        System.out.println("=== Initial Product Info ===");
        product.showInfo();

        int addStockConfirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to add stock?"
        );

        if (addStockConfirm == JOptionPane.YES_OPTION) {
            int amount = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter amount to add:")
            );
            product.addStock(amount);
        }

        int changePriceConfirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to change price?"
        );

        if (changePriceConfirm == JOptionPane.YES_OPTION) {
            double newPrice = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter new price:")
            );
            product.changePrice(newPrice);
        }

        System.out.println("=== Current Product Info ===");
        product.showInfo();
    }
}
