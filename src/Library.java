import java.util.ArrayList;

public class Library {

    private final ArrayList<String> libraryBooks = new ArrayList<>();

    public Library() {
        libraryBooks.add("Harry Potter");
        libraryBooks.add("Nate the Great");
        libraryBooks.add("Wheel of Time Series");
    }

    public void checkOutBook(User user) {
        System.out.println("\nAvailable books: " + libraryBooks);
        System.out.println("What book would you like to check out?: ");
        String book = Main.scanner.nextLine();

        if (!libraryBooks.contains(book)) {
            System.out.println("Invalid! That book is not available.");
            return;
        }

        libraryBooks.remove(book);
        user.addBook(book);

        System.out.println("You checked out: " + book);
        System.out.println("Your books now: " + user.getBooks());
    }

    public void returnBook(User user) {
        System.out.println("\nYour current books: " + user.getBooks());
        System.out.println("What book are you returning?: ");
        String book = Main.scanner.nextLine();

        if (!user.getBooks().contains(book)) {
            System.out.println("Invalid! You don’t have that book.");
            return;
        }

        user.removeBook(book);
        libraryBooks.add(book);

        System.out.println("You returned: " + book);
        System.out.println("Library books now: " + libraryBooks);
    }
}