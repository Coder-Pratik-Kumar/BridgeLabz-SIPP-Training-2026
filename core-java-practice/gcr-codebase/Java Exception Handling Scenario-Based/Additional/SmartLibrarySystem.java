/**
 * Smart Library System
 * Handles array index out of bounds and null pointer exceptions
 * Provides custom messages for each exception type
 */

public class SmartLibrarySystem {
    private String[] books;
    
    public SmartLibrarySystem(String[] books) {
        this.books = books;
    }
    
    /**
     * Get book length at given index
     * Handles: IndexOutOfBoundsException, NullPointerException
     */
    public int getBookLength(int index) {
        try {
            // Check array bounds
            if (index < 0 || index >= books.length) {
                throw new IndexOutOfBoundsException("Invalid index: " + index + 
                                                   ". Available books: 0 to " + (books.length - 1));
            }
            
            // Check for null
            if (books[index] == null) {
                throw new NullPointerException("Book at index " + index + " is null/missing");
            }
            
            int length = books[index].length();
            System.out.println("Book at index " + index + ": '" + books[index] + 
                             "' (Length: " + length + ")");
            return length;
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR - Invalid Index: " + e.getMessage());
            return -1;
        } catch (NullPointerException e) {
            System.out.println("ERROR - Null Book: " + e.getMessage());
            return -2;
        } catch (Exception e) {
            System.out.println("ERROR - Unexpected: " + e.getMessage());
            return -3;
        }
    }
    
    // Display all books
    public void displayLibrary() {
        System.out.println("\n=== Library Books ===");
        for (int i = 0; i < books.length; i++) {
            String book = books[i] == null ? "NULL/MISSING" : books[i];
            System.out.println("Index " + i + ": " + book);
        }
    }
    
    public static void main(String[] args) {
        String[] books = {"Java", "Python", null, "C++"};
        SmartLibrarySystem library = new SmartLibrarySystem(books);
        
        library.displayLibrary();
        
        // Test 1: Valid index
        System.out.println("\n[Test 1] Get length for valid index (0):");
        library.getBookLength(0);
        
        // Test 2: Null entry
        System.out.println("\n[Test 2] Get length for null entry (index 2):");
        library.getBookLength(2);
        
        // Test 3: Invalid index - out of bounds
        System.out.println("\n[Test 3] Get length for invalid index (5):");
        library.getBookLength(5);
        
        // Test 4: Negative index
        System.out.println("\n[Test 4] Get length for negative index (-1):");
        library.getBookLength(-1);
        
        // Test 5: Valid index with data
        System.out.println("\n[Test 5] Get length for valid index (3):");
        library.getBookLength(3);
    }
}
