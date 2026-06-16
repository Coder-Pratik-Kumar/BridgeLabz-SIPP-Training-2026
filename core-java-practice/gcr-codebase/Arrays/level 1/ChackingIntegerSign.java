/*Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint => 
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero. 
Finally compare the first and last element of the array and display if they equal, greater or less
 */
import java.util.*;
public class ChackingIntegerSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            int n = sc.nextInt();
            if(n>0){
                System.out.println("Positive");
            }
            else if(n<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Zero");
            }
        }
        sc.close();

    }  
}
