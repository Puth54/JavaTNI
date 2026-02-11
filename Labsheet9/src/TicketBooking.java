import javax.swing.JOptionPane;

public class TicketBooking {

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 120, "PG-13");

        String show_time = TicketInfo.select_showtime(movie);
        String seat_number = TicketInfo.select_seat_number();

        Ticket ticket = new Ticket("T001", movie, show_time, seat_number, 240);

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to book a " + movie.getTitle() + " ticket?"
        );

        if (confirm == JOptionPane.YES_OPTION) {

            JOptionPane.showMessageDialog(null, ticket.bookTicket());
        }

        JOptionPane.showMessageDialog(null, ticket.toString());
    }
}
