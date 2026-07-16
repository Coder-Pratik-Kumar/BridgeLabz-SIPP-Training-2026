import java.util.*;
public class HospitalEmergency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] priorities=new int[n];
        for(int i=0;i<n;i++) priorities[i]=sc.nextInt();
        int k=sc.nextInt();
        Arrays.sort(priorities);
        System.out.println(priorities[n-k]);
    }
}