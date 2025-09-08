package JavaConstructors;
public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "";
        this.author = "";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("1984", "George Orwell", 350.0);

        System.out.println(b1.getTitle() + " " + b1.getAuthor() + " " + b1.getPrice());
        System.out.println(b2.getTitle() + " " + b2.getAuthor() + " " + b2.getPrice());
    }
}
