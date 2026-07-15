import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height in cm: ");
        int amarHeight = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height in cm: ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height in cm: ");
        int anthonyHeight = input.nextInt();
        input.close();

        int youngestAge = amarAge;
        String youngestName = "Amar";
        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestName = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestName = "Anthony";
        }

        int tallestHeight = amarHeight;
        String tallestName = "Amar";
        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestName = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestName = "Anthony";
        }

        System.out.println("The youngest friend is " + youngestName + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestName + " with height " + tallestHeight + " cm");
    }
}
