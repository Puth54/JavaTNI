import javax.swing.*;

public class Lab307 {
    public static void main(String[] args) {

        double price, total = 0;

        while (true) {
            String input = JOptionPane.showInputDialog("Input price (press 0 to stop):");
            price = Double.parseDouble(input);

            if (price < 0) {
                JOptionPane.showMessageDialog(null, "Invalid price!!");
                continue;
            }

            if (price == 0) {
                break;
            }
            total += price;
        }

        JOptionPane.showMessageDialog(null,
                "Total price is " + total + "baht");
    }
}
