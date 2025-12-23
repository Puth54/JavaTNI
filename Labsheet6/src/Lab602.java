import java.util.Scanner;

public class Lab602 {

    public static int findRank(double[] scores, double targetScore) {
        int rank = 1;
        for (double score : scores) {
            if (score > targetScore) {
                rank++;
            }
        }
        return rank;
    }

    public static void main(String[] args) {

        String[] movies = {
                "Me Before You",
                "Titanic",
                "Before Sunrise",
                "The Holiday",
                "A Walk to Remember"
        };

        double[] rate_scores = {4.2, 4.9, 4.4, 3.7, 4.3};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a movie title: ");
        String inputTitle = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < movies.length; i++) {

            if (movies[i].equalsIgnoreCase(inputTitle)) {

                double score = rate_scores[i];
                int rank = findRank(rate_scores, score);

                System.out.println(
                        "The rating score of \"" + movies[i] + "\" is " + score
                );
                System.out.println(
                        "This movie is ranked number " + rank
                );

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Cannot found this movie title...");
        }

        sc.close();
    }
}
