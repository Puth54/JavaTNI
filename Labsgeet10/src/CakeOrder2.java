import javax.swing.JOptionPane;

public class CakeOrder2 {

    static String[] flavors = {
            "Chocolate",
            "Vanilla",
            "Strawberry",
            "Lemon",
            "Red Velvet"
    };

    public static String selectFlavor() {

        while (true) {

            String menu = "Select Flavor\n";

            for (int i = 0; i < flavors.length; i++) {
                menu += (i + 1) + ": " + flavors[i] + "\n";
            }

            int choice = Integer.parseInt(
                    JOptionPane.showInputDialog(menu)
            );

            if (choice >= 1 && choice <= flavors.length) {
                return flavors[choice - 1];
            }

            JOptionPane.showMessageDialog(null, "Wrong flavor!! Try again!!");
        }
    }

    public static void main(String[] args) {

        int option = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "1: Birthday Cake\n2: Cup Cake\n3: Donut")
        );

        if (option == 1) {

            String flavor = selectFlavor();

            String message = JOptionPane.showInputDialog("Enter cake message:");
            int pound = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter cake size (pound):")
            );

            BirthdayCake cake =
                    new BirthdayCake(message, flavor, pound, 350);

            JOptionPane.showMessageDialog(null, cake.toString());

        } else if (option == 2) {

            String flavor = selectFlavor();

            int pieces = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter number of cupcakes:")
            );

            CupCake cake =
                    new CupCake(flavor, pieces, 70);

            JOptionPane.showMessageDialog(null, cake.toString());

        } else if (option == 3) {

            String glaze = selectFlavor();

            int pieces = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter number of donuts:")
            );

            Donut donut =
                    new Donut(glaze, pieces, 30);

            JOptionPane.showMessageDialog(null, donut.toString());

        } else {

            JOptionPane.showMessageDialog(null,
                    "Wrong option!! Try again!!");
        }
    }
}
