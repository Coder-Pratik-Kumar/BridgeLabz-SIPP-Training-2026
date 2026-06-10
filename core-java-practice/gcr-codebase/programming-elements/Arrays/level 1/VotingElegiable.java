/*Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and for the element of the array check If the age is a negative number print an invalid age and if 18 or above, print The student with the age ___ can vote. Otherwise, print The student with the age ___ cannot vote. 
 */
import java.util.*;
 public class VotingElegiable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i:arr){
            if(i>=18){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        sc.close();
        for(boolean i:list){
            System.out.println(i);
        }


    }
 }