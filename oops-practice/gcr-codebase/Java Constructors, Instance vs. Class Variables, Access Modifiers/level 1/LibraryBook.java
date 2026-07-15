public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public boolean borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed: " + title);
            return true;
        } else {
            System.out.println("Book not available: " + title);
            return false;
        }
    }

    public void display() {
        System.out.println("Library Book:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
        System.out.println();
    }
}
