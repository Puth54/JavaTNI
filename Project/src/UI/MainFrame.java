package UI;

import Service.Management;
import Model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MainFrame extends JFrame {

    private Management management = new Management();
    private DefaultTableModel model;

    private JTextField txtId = new JTextField(5);
    private JTextField txtName = new JTextField(10);
    private JTextField txtPrice = new JTextField(5);
    private JTextField txtQty = new JTextField(5);
    private JTextField txtMin = new JTextField(5);
    private JTextField txtMax = new JTextField(5);

    private JLabel lblTotal = new JLabel();
    private JLabel lblLowStock = new JLabel();

    public MainFrame() {

        setTitle("Stationery Shop");
        setSize(900, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        model = new DefaultTableModel(
                new Object[]{"ID", "Name", "Qty"}, 0);

        JTable table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel input = new JPanel();

        input.add(new JLabel("ID")); input.add(txtId);
        input.add(new JLabel("Name")); input.add(txtName);
        input.add(new JLabel("Price")); input.add(txtPrice);
        input.add(new JLabel("Qty")); input.add(txtQty);
        input.add(new JLabel("Min")); input.add(txtMin);
        input.add(new JLabel("Max")); input.add(txtMax);

        JButton btnAdd = new JButton("Add");
        input.add(btnAdd);

        add(input, BorderLayout.NORTH);

        JButton btnPlus = new JButton("+");
        JButton btnMinus = new JButton("-");
        JButton btnReport = new JButton("Report");

        JPanel panel = new JPanel();
        panel.add(btnPlus);
        panel.add(btnMinus);
        panel.add(btnReport);

        add(panel, BorderLayout.WEST);

        JPanel dashboard = new JPanel();
        dashboard.add(new JLabel("Total:")); dashboard.add(lblTotal);
        dashboard.add(new JLabel("Low Stock:")); dashboard.add(lblLowStock);

        add(dashboard, BorderLayout.SOUTH);

        loadTable();
        refreshDashboard();

        btnAdd.addActionListener(e -> addProduct());
        btnPlus.addActionListener(e -> changeStock(table, true));
        btnMinus.addActionListener(e -> changeStock(table, false));
        btnReport.addActionListener(e -> new ReportFrame(management));
    }

    private void addProduct() {

        try {

            Product p = new Pen(
                    txtId.getText(),
                    txtName.getText(),
                    Double.parseDouble(txtPrice.getText()),
                    Integer.parseInt(txtQty.getText()),
                    Integer.parseInt(txtMax.getText()),
                    Integer.parseInt(txtMin.getText()),
                    true,
                    "Black",
                    0.5
            );

            if (!management.addProduct(p)) {
                JOptionPane.showMessageDialog(this, "Duplicate ID!");
                return;
            }

            loadTable();
            refreshDashboard();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Input");
        }
    }

    private void changeStock(JTable table, boolean increase) {

        int row = table.getSelectedRow();
        if (row == -1) return;

        String id = (String) model.getValueAt(row, 0);

        if (increase)
            management.increaseProductQuantity(id, 1);
        else
            management.decreaseProductQuantity(id, 1);

        loadTable();
        refreshDashboard();
    }

    private void loadTable() {

        model.setRowCount(0);

        for (Product p : management.getProducts()) {

            model.addRow(new Object[]{
                    p.getProductId(),
                    p.getProductName(),
                    p.getProductQuantity()
            });
        }
    }

    private void refreshDashboard() {

        int total = management.getProducts().size();
        int low = 0;

        for (Product p : management.getProducts())
            if (p.isLowStock())
                low++;

        lblTotal.setText(String.valueOf(total));
        lblLowStock.setText(String.valueOf(low));
    }
}