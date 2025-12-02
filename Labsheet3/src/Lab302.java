import javax.swing.JOptionPane;

public class Lab302 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Enter your name:");

        String h = JOptionPane.showInputDialog(null, "Enter your height (cm.):");
        int height = Integer.parseInt(h);

        int maleOption = JOptionPane.showConfirmDialog(
                null,
                "Are you biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION
        );

        if (maleOption == JOptionPane.YES_OPTION) {
            double weight = (height - 100) * 0.9;

            JOptionPane.showMessageDialog(
                    null,
                    "Hello, Mr. " + name + "\nYour weight should be " + String.format("%.2f", weight) + " kg."
            );
        } else {
            int femaleOption = JOptionPane.showConfirmDialog(
                    null,
                    "Are your biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION
            );

            if (femaleOption == JOptionPane.YES_OPTION) {
                double weight = (height - 110) * 0.9;

                JOptionPane.showMessageDialog(
                        null,
                        "Hello, Ms. " + name + "\nYour weight should be " + String.format("%.2f", weight) + " kg."
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "You can use BMI to measure your weight and height."
                );
            }
        }
    }
}
