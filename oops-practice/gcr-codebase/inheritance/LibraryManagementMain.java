public class LibraryManagementMain {
    public static void main(String[] args) {
        Author author = new Author("The Time Machine", 1895, "H. G. Wells", "English writer best known for his works in science fiction.");

        System.out.println("=== Library Management ===");
        author.displayInfo();
    }
}

class Book {
    private String title;
    private int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getBookDetails() {
        return "Book{title='" + title + "', publicationYear=" + publicationYear + "}";
    }
}

class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println(getBookDetails());
        System.out.println("Author{name='" + name + "', bio='" + bio + "'}");
    }
}
