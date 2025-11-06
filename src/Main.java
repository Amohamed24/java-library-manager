import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hey, what's your name?: ");
        String name = scanner.nextLine();

        User user = new User(name);
        Library library = new Library();

        System.out.println("Hi " + name + "! Welcome to Library Manager!");

        while (true) {
            System.out.println("\n*********************************************");
            System.out.println("What would you like to do?");
            System.out.println("1) Return a book");
            System.out.println("2) Check out a book");
            System.out.println("(type 'q' to quit)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Thanks for playing " + user.getName() + "!");
                break;
            }

            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid! Enter 1 or 2.");
                continue;
            }

            switch (choice) {
                case 1 -> library.returnBook(user);
                case 2 -> library.checkOutBook(user);
                default -> System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}




