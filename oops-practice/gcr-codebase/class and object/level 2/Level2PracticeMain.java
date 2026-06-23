public class Level2PracticeMain {
    public static void main(String[] args) {
        Student s = new Student("Bob", 12, 86.5);
        s.display();

        BankAccount acct = new BankAccount("Carol", "AC123", 500.0);
        acct.displayBalance();
        acct.deposit(150.0);
        acct.withdraw(100.0);
        acct.withdraw(1000.0);
        acct.displayBalance();

        PalindromeChecker pc = new PalindromeChecker("A man, a plan, a canal: Panama");
        pc.displayResult();

        MovieTicket ticket = new MovieTicket("Interstellar");
        ticket.bookTicket("B12", 10.0);
        ticket.displayDetails();

        CartItem cart = new CartItem("Pen", 2.5, 3);
        cart.display();
        cart.add(2);
        cart.remove(1);
        cart.display();
    }
}
