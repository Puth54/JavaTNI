package UI;

import Service.Management;
import Model.Product;

import javax.swing.*;

public class ReportFrame extends JFrame {

    public ReportFrame(Management management) {

        setTitle("Inventory Report");
        setSize(400, 400);
        setVisible(true);

        JTextArea area = new JTextArea();

        for (Product p : management.getProducts()) {
            area.append(p.toString(p.getProductId()) + "\n");
        }

        add(new JScrollPane(area));
    }
}