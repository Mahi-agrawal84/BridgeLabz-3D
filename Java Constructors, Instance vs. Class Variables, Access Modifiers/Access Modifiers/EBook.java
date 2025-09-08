package AccessModifiers;
public class EBook extends Book {
    String fileFormat;

    EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
        System.out.println("File Format: " + fileFormat);
    }

    public static void main(String[] args) {
        Book b1 = new Book("123-456", "Java Programming", "James Gosling");
        b1.displayBookDetails();
        b1.setAuthor("Updated Author");
        b1.displayBookDetails();

        EBook eb = new EBook("789-101", "Python Programming", "Guido van Rossum", "PDF");
        eb.displayEBookDetails();
    }
}


