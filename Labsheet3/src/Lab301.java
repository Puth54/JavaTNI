import java.util.Scanner;

public class Lab301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("This is Zero number.");
        } else {
            if (num %2 ==0) {
                System.out.print("This number is Even");
            } else {
                System.out.print("The number is odd");
            }

            if (num > 0) {
                System.out.println(" and Positive number.");
            } else {
                System.out.println(" and Negative number.");
            }
        }

        sc.close();
    }
}
