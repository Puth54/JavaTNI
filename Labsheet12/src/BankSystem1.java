package Banking;

import java.util.Scanner;

public class BankSystem1 {

    static Scanner sc = new Scanner(System.in);

    public static String input_account_id() {

        String id;

        while (true) {

            System.out.print("Enter account id: ");
            id = sc.nextLine();

            if (id.length() == 10) {
                return id;
            }

            System.out.println("Account must be 10 characters.");
        }
    }

    public static double input_initial_balance() {

        while (true) {

            try {
                System.out.print("Enter your initial deposit amount: ");
                return Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Try again!!");
            }
        }
    }

    public static void main(String[] args) {

        String account_bank = input_account_id();
        double initial_balance = input_initial_balance();

        OpenNewAccount account =
                new OpenNewAccount(account_bank, initial_balance);

        System.out.println(account.recordAccount());
    }
}
