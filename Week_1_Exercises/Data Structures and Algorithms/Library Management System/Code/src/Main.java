import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(100);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Linear Search by Title");
            System.out.println("3. Binary Search by Title");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            int id;
            String title, author;

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    author = scanner.nextLine();
                    library.addBook(new Book(id, title, author));
                    break;

                case 2:
                    System.out.print("Enter Title to search (Linear): ");
                    title = scanner.nextLine();
                    Book result1 = library.linearSearchByTitle(title);
                    if (result1 != null) result1.display();
                    else System.out.println("Book not found.");
                    break;

                case 3:
                    System.out.print("Enter Title to search (Binary): ");
                    title = scanner.nextLine();
                    Book result2 = library.binarySearchByTitle(title);
                    if (result2 != null) result2.display();
                    else System.out.println("Book not found.");
                    break;

                case 4:
                    library.displayAllBooks();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
