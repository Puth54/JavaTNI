import javax.swing.JOptionPane;

public class Lab207 {
    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null,
                "Welcome to the payroll application");

        String name = JOptionPane.showInputDialog("Enter employee name:");

        String hourInput = JOptionPane.showInputDialog("Enter total hour for this employee:");
        double hours = Double.parseDouble(hourInput);

        double wagePerHour = 7.50;
        double taxRate = 0.15;

        double gross = hours * wagePerHour;
        double tax = gross * taxRate;
        double net = gross - tax;

        JOptionPane.showMessageDialog(null,
                "Employee name: " + name +
                        "\nHour worked: " + (int)hours +
                        "\nHourly wage: $" + String.format("%.2f", wagePerHour) +
                        "\nGross earnings: $" + String.format("%.2f", gross) +
                        "\nTax rate: 0.15" +
                        "\nTax: $" + String.format("%.2f", tax) +
                        "\nNet earnings: $" + String.format("%.2f", net));
    }
}
