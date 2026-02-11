import javax.swing.JOptionPane;

public class ReturnBookTest {

    public static void main(String[] args) {

        Book book = new Book("Java Programming", 5);

        while (true) {

            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "ต้องการยืม/คืนหนังสือหรือไม่?"
            );

            if (confirm != JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                break;
            }

            String menu = JOptionPane.showInputDialog("1: Borrow\n2: Return");

            if (menu.equals("1")) {

                if (book.getAvailableBook() == 0) {
                    JOptionPane.showMessageDialog(null, "No books available to borrow...");
                    continue;
                }

                book.borrowBook();

                System.out.println(
                        "Borrowed 1 book, available " +
                                book.getAvailableBook() + " books."
                );

            } else if (menu.equals("2")) {

                if (book.getAvailableBook() == book.getTotalBook()) {
                    JOptionPane.showMessageDialog(null, "Cannot return! All books are already here.");
                    continue;
                }

                book.returnBook();

                System.out.println(
                        "Returned 1 book, available " +
                                book.getAvailableBook() + " books."
                );

            } else {
                JOptionPane.showMessageDialog(null, "END PROGRAM");
                break;
            }
        }
    }
}
