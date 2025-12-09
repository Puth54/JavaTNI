import javax.swing.*;

public class Lab402 {
    public static void main(String[] args) {
        String id = JOptionPane.showInputDialog(null, "Enter student-id:");

        if (id == null || !id.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(null, "Invalid student ID!");
            return;
        }

        String major = "";

        char c = id.charAt(4);

        switch (c) {
            case '1': major = "Information Technology (IT)"; break;
            case '2': major = "Multimedia Technology (MT)"; break;
            case '3': major = "Digital Business Information Technology (BI)"; break;
            case '4': major = "Digital Technology in Mass Communication (DC)"; break;
            case '5': major = "Data Science and Data Analytics (DS)"; break;
            default: major = "Cannot found major";
        }

        JOptionPane.showMessageDialog(null,
                "Student ID: " + id + "\nMajor: " + major);
    }
}
