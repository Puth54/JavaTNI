import javax.swing.JOptionPane;

public class Lab304 {
    public static void main(String[] args) {

        double weight = 0, height = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                String w = JOptionPane.showInputDialog(null, "Enter your weight (kg.):");
                weight = Double.parseDouble(w);
                validInput = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please enter numbers only.");
            }
        }

        validInput = false;

        while (!validInput) {
            try {
                String h = JOptionPane.showInputDialog(null, "Enter your height (cm.):");
                height = Double.parseDouble(h);
                validInput = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please enter numbers only.");
            }
        }

        double bmi = weight / Math.pow(height / 100.0, 2);

        String result;
        if (bmi < 18.5)
            result = "Underweight";
        else if (bmi < 24.9)
            result = "Healthy Weight";
        else if (bmi < 29.9)
            result = "Overweight";
        else
            result = "Obese";

        JOptionPane.showMessageDialog(
                null,
                "Your BMI is " + String.format("%.2f", bmi) +
                        "\nBMI result is " + result
        );
    }
}
//version ดีที่สุด