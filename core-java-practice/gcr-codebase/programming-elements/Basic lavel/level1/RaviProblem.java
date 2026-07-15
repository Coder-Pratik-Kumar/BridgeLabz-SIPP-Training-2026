/*Ravi just joined a coding guild. Store his name, age, rank, salary, and
membership fee (float) using correct data types. Compute his
annual bonus (12% of salary), cast it to int, and print a formatted
welcome card.
/* */

public class RaviProblem {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 25;
        String rank = "Novice";
        double salary = 50000.0;
        float membershipFee = 150.75f;

        double annualBonus = salary * 0.12;
        int annualBonusInt = (int) annualBonus;

        System.out.println("Welcome to the Coding Guild, " + name + "!");
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Salary: $" + salary);
        System.out.println("Membership Fee: $" + membershipFee);
        System.out.println("Annual Bonus: $" + annualBonusInt);
    }
    
}