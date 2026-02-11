public class CakeOrder {

    public static void main(String[] args) {

        BirthdayCake order1 =
                new BirthdayCake("Happy Birthday", "Chocolate", 2, 400);

        CupCake order2 =
                new CupCake("Vanilla", 8, 75);

        Donut order3 =
                new Donut("Strawberry Glaze", 12, 30);

        System.out.println(order1);
        System.out.println("---------------------");

        System.out.println(order2);
        System.out.println("---------------------");

        System.out.println(order3);
        System.out.println("---------------------");

        double total =
                order1.calculateTotalPrice()
                        + order2.calculateTotalPrice()
                        + order3.calculateTotalPrice();

        System.out.println("Total price of all orders = " + total);
    }
}
