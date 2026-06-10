import java.util.Scanner;

public class DistanceFeetConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();
        input.close();

        double yards = distanceInFeet / 3.0;
        double miles = yards / 1760.0;
        System.out.println("The distance " + distanceInFeet + " feet is " + yards + " yards and " + miles + " miles");
    }
}
