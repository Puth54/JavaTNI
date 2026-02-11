import javax.swing.JOptionPane;

public class TicketInfo {

    public static String select_showtime(Movie movie) {

        String input = JOptionPane.showInputDialog(
                "Select Showtime for " + movie.getTitle() +
                        "\n1: 13:00\n2: 14:30\n3: 15:00"
        );

        int choice = Integer.parseInt(input);

        switch (choice) {
            case 1: return "13:00";
            case 2: return "14:30";
            case 3: return "15:00";
            default: return "Error time";
        }
    }

    public static String select_seat_number() {

        String row = JOptionPane.showInputDialog("Enter Row (A-G):");
        int seat = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Seat Number (1-12):")
        );

        return row.toUpperCase() + seat;
    }

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 120, "PG-13");

        String show_time = select_showtime(movie);
        String seat_number = select_seat_number();

        Ticket ticket = new Ticket("T001", movie, show_time, seat_number, 240);

        JOptionPane.showMessageDialog(null, ticket.toString());
    }
}
