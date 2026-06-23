public class Level1ConstructorsMain {
    public static void main(String[] args) {
        // Book with default and parameterized constructors
        Book defaultBook = new Book();
        Book paramBook = new Book("1984", "George Orwell", 9.99);
        defaultBook.display();
        paramBook.display();

        // Circle constructor chaining
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(2.5);
        defaultCircle.display();
        customCircle.display();

        // Person copy constructor
        Person p1 = new Person("Dana", 28);
        Person p2 = new Person(p1);
        p1.display();
        p2.display();

        // HotelBooking default, parameterized, copy
        HotelBooking hDefault = new HotelBooking();
        HotelBooking hParam = new HotelBooking("Eve", "Deluxe", 3);
        HotelBooking hCopy = new HotelBooking(hParam);
        hDefault.display();
        hParam.display();
        hCopy.display();

        // LibraryBook borrow
        LibraryBook lb = new LibraryBook("Clean Code", "Robert C. Martin", 25.0);
        lb.display();
        lb.borrow();
        lb.borrow(); // try borrowing again
        lb.display();

        // CarRental examples
        CarRental cr1 = new CarRental("Frank", "Toyota Camry", 4, 40.0);
        CarRental cr2 = new CarRental("Grace", "Honda Civic", 2);
        cr1.display();
        cr2.display();
    }
}
