
import java.util.*;
public class AssistedProblems1{
    public static void main(String[]args){
        // Write a program that prints "Welcome to Bridgelabz!" to the screen.
        System.out.println("Welcome to Bridgelabz!");
//         Write a program that takes two numbers as input from the user and prints
// their sum.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int n = sc.nextInt();
        System.out.print("Enter the second  no:- ");
        int m = sc.nextInt();
        System.out.println(n+m);

        /*Write a program that takes the temperature in Celsius as input and converts
it to Fahrenheit using the formula:*/
        System.out.print("Enter the temperature:- ");
        int tempInCalsius = sc.nextInt();
        int tempInFahrenheit = (tempInCalsius * 9/5) + 32;
        System.out.println(tempInFahrenheit);
        /*Write a program to calculate the area of a circle. Take the radius as input
and use the formula: */
        System.out.print("Enter the radius of the circle:- ");
        int radius = sc.nextInt();
        float pie = 22/7;
        System.out.println(Math.pow(radius, 2)*pie);
        /*Write a program to calculate the volume of a cylinder. Take the radius and
height as inputs and use the formula: */
        System.out.print("Enter the height of cylender:- ");
        int height = sc.nextInt();
        System.out.print("Enter the radius:- ");
        int radiusC = sc.nextInt();
        System.out.println("area:- "+height*pie*Math.pow(radiusC, 2));


    }
}

