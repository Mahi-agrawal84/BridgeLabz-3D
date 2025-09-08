package JavaConstructors;
public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book not available: " + title);
        }
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Basics", "John Smith", 299.99, true);
        b1.borrowBook();
        b1.borrowBook();
    }
}

