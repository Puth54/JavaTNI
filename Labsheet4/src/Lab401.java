import javax.swing.*;

public class Lab401 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter your full name:");

        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Invalid input!");
            return;
        }

        String[] parts = input.trim().split("\\s+");

        if (parts.length != 2) {
            JOptionPane.showMessageDialog(null, "Invalid format, input again!");
            return;
        }

        String firstName = parts[0];
        String lastName = parts[1];

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

        lastName = lastName.toUpperCase();

        JOptionPane.showMessageDialog(null, "Welcome, " + firstName + " " + lastName);
    }
}
