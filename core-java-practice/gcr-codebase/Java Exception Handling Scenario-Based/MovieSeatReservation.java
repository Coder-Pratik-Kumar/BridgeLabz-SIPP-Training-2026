/**
 * Movie Seat Reservation
 * Handles array out-of-bounds exception
 * Returns seat if valid, -1 if exception occurs
 */

public class MovieSeatReservation {
    private int[] seats;
    
    public MovieSeatReservation(int[] seats) {
        this.seats = seats;
    }
    
    /**
     * Get seat at given index
     * Handles: Array out-of-bounds exception
     * Returns: Seat number if valid, -1 if invalid
     */
    public int getSeat(int index) {
        try {
            if (index < 0 || index >= seats.length) {
                throw new IndexOutOfBoundsException("Invalid seat index: " + index + 
                                                   ", Available: 0 to " + (seats.length - 1));
            }
            System.out.println("Seat found at position " + index + ": " + seats[index]);
            return seats[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: " + e.getMessage());
            return -1;
        }
    }
    
    /**
     * Get seat with string input
     * Handles: NumberFormatException, Array out-of-bounds
     */
    public int getSeatWithValidation(String indexStr) {
        try {
            int index = Integer.parseInt(indexStr);
            return getSeat(index);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid input '" + indexStr + "' - not a valid integer");
            return -1;
        }
    }
    
    // Display all seats
    public void displaySeats() {
        System.out.println("\nAvailable Seats:");
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Position " + i + ": " + seats[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] bookedSeats = {101, 102, 103, 104, 105};
        MovieSeatReservation reservation = new MovieSeatReservation(bookedSeats);
        
        System.out.println("=== Movie Seat Reservation ===");
        reservation.displaySeats();
        
        // Test 1: Valid seat
        System.out.println("\n[Test 1] Get valid seat at position 2:");
        int seat = reservation.getSeat(2);
        System.out.println("Result: " + seat);
        
        // Test 2: Invalid - position 8 (out of bounds, only 5 seats)
        System.out.println("\n[Test 2] Get seat at position 8 (invalid - only 5 seats exist):");
        int invalidSeat = reservation.getSeat(8);
        System.out.println("Result: " + invalidSeat);
        
        // Test 3: Negative index
        System.out.println("\n[Test 3] Get seat at position -1 (negative):");
        reservation.getSeat(-1);
        
        // Test 4: String input - invalid
        System.out.println("\n[Test 4] Get seat with string 'abc':");
        reservation.getSeatWithValidation("abc");
        
        // Test 5: String input - valid
        System.out.println("\n[Test 5] Get seat with string '4':");
        reservation.getSeatWithValidation("4");
    }
}
