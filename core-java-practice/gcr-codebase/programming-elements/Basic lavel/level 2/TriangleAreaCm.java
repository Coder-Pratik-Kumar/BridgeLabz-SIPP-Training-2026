import java.util.Scanner;

public class TriangleAreaCm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double baseCm = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();
        input.close();

        double areaSqCm = 0.5 * baseCm * heightCm;
        double areaSqIn = areaSqCm / (2.54 * 2.54);
        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);
    }
}
