package CoffeeShop;

import java.util.Scanner;

public class CoffeeShop {

    static Scanner sc = new Scanner(System.in);

    // ===== สั่ง Espresso =====
    public static Espresso orderEspresso() {
        System.out.print("Enter size (S/M/L): ");
        char size = sc.next().charAt(0);

        Espresso esp = new Espresso(size);

        System.out.print("Add coffee shot? (y/Y): ");
        char ans = sc.next().charAt(0);

        if (ans == 'y' || ans == 'Y') {
            System.out.print("Number of shots: ");
            int shot = sc.nextInt();
            esp.addShot(shot);
        }

        return esp;
    }

    // ===== สั่ง Frappuccino =====
    public static Frappuccino orderFrappuccino() {
        System.out.print("Enter size (S/M/L): ");
        char size = sc.next().charAt(0);

        System.out.print("Add whipped cream? (y/Y): ");
        char ans = sc.next().charAt(0);

        boolean whipped = (ans == 'y' || ans == 'Y');
        return new Frappuccino(size, whipped);
    }

    // ===== main =====
    public static void main(String[] args) {

        int espressoCount = 0;
        int frappuccinoCount = 0;
        double totalPrice = 0;

        while (true) {
            System.out.println("\n1. Espresso");
            System.out.println("2. Frappuccino");
            System.out.print("Select menu: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                Espresso e = orderEspresso();
                System.out.println(e);
                espressoCount++;
                totalPrice += e.calculateFinalPrice();

            } else if (menu == 2) {
                Frappuccino f = orderFrappuccino();
                System.out.println(f);
                frappuccinoCount++;
                totalPrice += f.calculateFinalPrice();

            } else {
                break;
            }

            System.out.print("Do you want to order more [y/Y]? ");
            char more = sc.next().charAt(0);

            if (!(more == 'y' || more == 'Y')) {
                break;
            }
        }

        System.out.println("\n===== SUMMARY =====");
        System.out.println("Espresso orders: " + espressoCount);
        System.out.println("Frappuccino orders: " + frappuccinoCount);
        System.out.println("Total income: " + totalPrice + " Baht");
    }
}
