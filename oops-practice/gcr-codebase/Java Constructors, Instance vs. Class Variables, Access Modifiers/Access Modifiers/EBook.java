public class EBook extends Book {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBook() {
        // can access public ISBN and protected title
        System.out.println("E-Book:");
        System.out.println("ISBN (public): " + ISBN);
        System.out.println("Title (protected): " + title);
        System.out.println("Author (via getter): " + getAuthor());
        System.out.println("Size (MB): " + fileSizeMB);
        System.out.println();
    }
}
