import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in inches: ");
        double base = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        input.close();

        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 2.54 * 2.54;
        System.out.println("The area of the triangle is " + areaInSqInches + " square inches and " + areaInSqCm + " square centimeters");
    }
}
