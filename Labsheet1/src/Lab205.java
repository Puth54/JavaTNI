import javax.swing.JOptionPane;

public class Lab205 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Input minutes : ");
        int totalMinutes = Integer.parseInt(input);

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        JOptionPane.showMessageDialog(null,
                totalMinutes + " minutes is " + hours + " hour " + minutes + " minute");
    }
}
