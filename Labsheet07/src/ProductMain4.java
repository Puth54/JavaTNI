import java.util.Scanner;

public class ProductMain4 {

    public static void setting_product(Product... products) {
        String[] names = {"Pens", "Pencils", "Markers", "Highlighters"};
        double[] prices = {25.5, 17.25, 30, 35};
        int[] quantities = {20, 35, 10, 40};

        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            products[i].name = names[i];
            products[i].price = prices[i];
            products[i].quantity = quantities[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[4];
        setting_product(products);

        System.out.println("=== Product List ===");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i].name +
                    " (" + products[i].quantity + " items)");
        }

        int choice;
        do {
            System.out.print("Select product number: ");
            choice = sc.nextInt();
        } while (choice < 1 || choice > products.length);

        System.out.print("Enter quantity to buy: ");
        int amount = sc.nextInt();

        products[choice - 1].sell(amount);
        products[choice - 1].showInfo();
    }
}
