import java.util.*;
public class MergeCustomerRecords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int[] firstBranch=new int[n1];
        for(int i=0;i<n1;i++) firstBranch[i]=sc.nextInt();
        int n2=sc.nextInt();
        int[] secondBranch=new int[n2];
        for(int i=0;i<n2;i++) secondBranch[i]=sc.nextInt();
        int i=0,j=0;
        ArrayList<Integer> merged=new ArrayList<>();
        while(i<n1&&j<n2){
            if(firstBranch[i]<=secondBranch[j]) merged.add(firstBranch[i++]);
            else merged.add(secondBranch[j++]);
        }
        while(i<n1) merged.add(firstBranch[i++]);
        while(j<n2) merged.add(secondBranch[j++]);
        System.out.println(merged);
    }
}