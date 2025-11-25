import java.util.Scanner;


public class Lab204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input hour : ");
        int hour = sc.nextInt();

        System.out.print("Input minute : ");
        int minute = sc.nextInt();

        int totalMinutes = (hour * 60) + minute;

        System.out.println("Total time is " + totalMinutes + " minutes");
    }
}
