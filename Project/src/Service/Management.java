package Service;

import Model.Product;
import java.util.ArrayList;
import java.io.*;

public class Management {

    private ArrayList<Product> products;
    private final String FILE_NAME = "products.dat";

    public Management() {
        loadData();
    }

    public boolean addProduct(Product p) {

        if (checkProductId(p.getProductId()))
            return false;

        products.add(p);
        saveData();

        return true;
    }

    public boolean checkProductId(String id) {

        for (Product p : products)
            if (p.getProductId().equals(id))
                return true;

        return false;
    }

    public Product findProduct(String id) {

        for (Product p : products)
            if (p.getProductId().equals(id))
                return p;

        return null;
    }

    public void increaseProductQuantity(String id, int qty) {

        Product p = findProduct(id);

        if (p != null) {
            p.setProductQuantity(p.getProductQuantity() + qty);
            saveData();
        }
    }

    public void decreaseProductQuantity(String id, int qty) {

        Product p = findProduct(id);

        if (p != null) {
            p.setProductQuantity(p.getProductQuantity() - qty);
            saveData();
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    private void saveData() {

        try {
            ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(FILE_NAME));

            out.writeObject(products);
            out.close();

        } catch (Exception e) {
            System.out.println("Save Failed");
        }
    }

    private void loadData() {

        try {
            ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream(FILE_NAME));

            products = (ArrayList<Product>) in.readObject();
            in.close();

        } catch (Exception e) {
            products = new ArrayList<>();
        }
    }
}