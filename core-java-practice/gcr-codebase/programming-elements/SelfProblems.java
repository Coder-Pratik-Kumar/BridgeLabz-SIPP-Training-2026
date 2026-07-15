import java.util.*;
public class SelfProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.
Take Principal, Rate, and Time as inputs from the user. */
        System.out.print("Enter the principle amount:- ");
        int Principle = sc.nextInt();
        System.out.print("Enter the Rate of interest:- ");
        int rate = sc.nextInt();
        System.out.println("Enter the Time:- ");
        int time = sc.nextInt();
        System.out.println(Principle*rate*time);
/*Write a program that takes two numbers as input: a base and an exponent,
and prints the result of base raised to the exponent (without using loops or
conditionals). */
        System.out.println("Enter the number base:- ");
        int base = sc.nextInt();
        System.out.println("Eneter the number exp: -");
        int exp = sc.nextInt();
        System.out.println(Math.pow(base, exp));

        /*Write a program that takes three numbers as input from the user and prints
their average. */
        System.out.println("Enter the number1:- ");
        int n1 = sc.nextInt();
        System.out.println("Enter the number2:- ");
        int n2=sc.nextInt();
        System.out.println("Enter the number3:- ");
        int n3 = sc.nextInt();
        System.err.println((n1+n2+n3)/3);

        /*Write a program that takes the distance in kilometers as input from the user
and converts it into miles using the formula:
Miles = Kilometers * 0.621371. */
        System.out.println("Enter the kilometer:- ");
        int kil = sc.nextInt();
        System.out.println(kil*0.621371);

        sc.close();
        
    }
}
