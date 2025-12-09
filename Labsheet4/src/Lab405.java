import java.util.Scanner;

public class Lab405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;

        while (true) {
            System.out.print("Input some sentence: ");
            sentence = sc.nextLine();

            if (sentence.endsWith(".")) break;

            System.out.println("The sentence must end with full stop point: " + sentence);
        }

        String[] words = sentence.substring(0, sentence.length() - 1).split("\\s+");

        for (String word : words) {
            System.out.println(word);
        }
    }
}
