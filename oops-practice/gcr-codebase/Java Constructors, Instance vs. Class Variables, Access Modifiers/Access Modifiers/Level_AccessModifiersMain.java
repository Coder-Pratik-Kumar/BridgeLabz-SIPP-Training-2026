public class Level_AccessModifiersMain {
    public static void main(String[] args) {
        // Student and PostgraduateStudent
        Student s = new Student(1, "Alice", 8.5);
        s.display();
        // access public rollNumber directly
        System.out.println("Access public rollNumber: " + s.rollNumber);
        // cannot access s.cgpa directly (private) - use getter
        System.out.println("Access CGPA via getter: " + s.getCgpa());
        System.out.println();

        PostgraduateStudent pg = new PostgraduateStudent(2, "Bob", 9.0, "AI");
        pg.displayWithResearch();

        // Book and EBook
        Book b = new Book("ISBN123", "Effective Java", "Joshua Bloch");
        b.display();
        b.setAuthor("J. Bloch");
        EBook eb = new EBook("ISBN123-EB", "Effective Java (e)", "Joshua Bloch", 5.2);
        eb.displayEBook();

        // BankAccount and SavingsAccount
        BankAccount ba = new BankAccount("AC1001", "Carol", 1000.0);
        ba.display();
        ba.deposit(200.0);
        ba.withdraw(50.0);
        ba.display();

        SavingsAccount sa = new SavingsAccount("AC2002", "Dave", 500.0, 2.0);
        sa.applyInterest();
        sa.displaySavings();

        // Employee and Manager
        Employee e = new Employee(101, "HR", 45000.0);
        e.display();
        Manager m = new Manager(102, "Engineering", 85000.0, "Senior");
        m.displayManager();
    }
}
