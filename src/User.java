import java.util.ArrayList;

public class User {

    private final String name;
    private final ArrayList<String> books = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }
}