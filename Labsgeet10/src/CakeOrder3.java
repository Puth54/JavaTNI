import javax.swing.JOptionPane;

public class CakeOrder3 {

    public static void main(String[] args) {

        int pound = Integer.parseInt(
                JOptionPane.showInputDialog("Enter cake size (pound):")
        );

        String flavor = CakeOrder2.selectFlavor();

        String message = JOptionPane.showInputDialog("Enter cake message:");

        BirthdayCake cake =
                new BirthdayCake(message, flavor, pound, 400);

        while (true) {

            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    cake.toString() + "\n\nConfirm this order?"
            );

            if (confirm == JOptionPane.YES_OPTION) {

                JOptionPane.showMessageDialog(null,
                        "ORDER CONFIRMED\n\n" + cake.toString());
                break;
            }

            message = JOptionPane.showInputDialog(
                    "Enter NEW cake message:"
            );

            cake =
                    new BirthdayCake(message, flavor, pound, 400);
        }
    }
}
