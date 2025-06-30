import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Book[] books;
    private int size;

    public Library(int capacity) {
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
            System.out.println("Book added.");
        } else {
            System.out.println("Library is full.");
        }
    }

    // Linear Search – O(n)
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].title.equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null;
    }

    // Binary Search – O(log n)
    public Book binarySearchByTitle(String title) {
        // First, sort the books alphabetically by title
        Arrays.sort(books, 0, size, Comparator.comparing(b -> b.title.toLowerCase()));

        int left = 0;
        int right = size - 1;
        title = title.toLowerCase();

        while (left <= right) {
            int mid = (left + right) / 2;
            String midTitle = books[mid].title.toLowerCase();

            int comparison = title.compareTo(midTitle);
            if (comparison == 0) return books[mid];
            else if (comparison < 0) right = mid - 1;
            else left = mid + 1;
        }
        return null;
    }

    public void displayAllBooks() {
        if (size == 0) {
            System.out.println("Library is empty.");
            return;
        }
        for (int i = 0; i < size; i++) {
            books[i].display();
        }
    }
}
