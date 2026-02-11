import javax.swing.JOptionPane;

public class TicketUsed {
    public static String show_movie_list(Ticket... tickets) {

        String result = "";

        for (Ticket t : tickets) {
            result += t.getMovie() + "\n";
        }

        return result;
    }

    public static Ticket findTicket(Ticket[] tickets, String id) {

        for (Ticket t : tickets) {
            if (t.getTicket_id().equalsIgnoreCase(id)) {
                return t;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Ticket[] tickets = new Ticket[] {
                new Ticket("T001", new Movie("Titanic", 120,"PG-13"),"12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        int confirm = JOptionPane.showConfirmDialog(
                null,
                "Do you want to book or use a ticket?"
        );

        if (confirm != JOptionPane.YES_OPTION) return;

        while (true) {

            String ticket_id = JOptionPane.showInputDialog(
                    "Movie List:\n" +
                            show_movie_list(tickets) +
                            "\nEnter Ticket ID:"
            );

            Ticket selected = findTicket(tickets, ticket_id);

            if (selected == null) {
                JOptionPane.showMessageDialog(null, "Ticket not found");
                continue;
            }

            String menu = JOptionPane.showInputDialog(
                    "1: Book Ticket\n2: Use Ticket\n3: Show Info"
            );

            if (menu.equals("1")) {

                JOptionPane.showMessageDialog(null, selected.bookTicket());

            } else if (menu.equals("2")) {

                JOptionPane.showMessageDialog(null, selected.useTicket());

            } else if (menu.equals("3")) {

                JOptionPane.showMessageDialog(null, selected.toString());

            } else {
                break;
            }

            JOptionPane.showMessageDialog(null, selected.toString());

            int again = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to book or use other tickets?"
            );

            if (again != JOptionPane.YES_OPTION) break;
        }
    }
}
