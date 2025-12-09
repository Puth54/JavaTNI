import javax.swing.*;

public class Lab403 {
    public static void main(String[] args) {
        final String USERNAME = "admin";
        final String PASSWORD = "Admin1234";

        String user = JOptionPane.showInputDialog(null, "Enter username:");
        String pass = JOptionPane.showInputDialog(null, "Enter password:");

        if (user == null || pass == null) return;

        if (user.equalsIgnoreCase(USERNAME) && pass.equals(PASSWORD)) {
            JOptionPane.showMessageDialog(null, "Login Success!!");
        } else {
            JOptionPane.showMessageDialog(null, "Login Fail...");
        }
    }
}
