import java.util.*;
public class EmployeePromotionConflicts {
    static long mergeSort(int[] arr,int l,int r){
        long count=0;
        if(l<r){
            int m=(l+r)/2;
            count+=mergeSort(arr,l,m);
            count+=mergeSort(arr,m+1,r);
            count+=merge(arr,l,m,r);
        }
        return count;
    }
    static long merge(int[] arr,int l,int m,int r){
        long count=0;
        int[] temp=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m&&j<=r){
            if(arr[i] < arr[j]){
                count+=(m-i+1);
                temp[k++]=arr[i++];
            }else temp[k++]=arr[j++];
        }
        while(i<=m) temp[k++]=arr[i++];
        while(j<=r) temp[k++]=arr[j++];
        for(i=0;i<temp.length;i++) arr[l+i]=temp[i];
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] scores=new int[n];
        for(int i=0;i<n;i++) scores[i]=sc.nextInt();
        System.out.println(mergeSort(scores,0,n-1));
    }
}