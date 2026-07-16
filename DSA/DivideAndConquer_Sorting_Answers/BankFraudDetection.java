import java.util.*;
public class BankFraudDetection {
    static int[] arr;
    static long count=0;
    static void mergeSort(int l,int r){
        if(l>=r) return;
        int m=(l+r)/2;
        mergeSort(l,m);
        mergeSort(m+1,r);
        int j=m+1;
        for(int i=l;i<=m;i++){
            while(j<=r && arr[i] > 3L*arr[j]) j++;
            count += (j-(m+1));
        }
        merge(l,m,r);
    }
    static void merge(int l,int m,int r){
        int[] temp=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m&&j<=r) temp[k++]=arr[i]<=arr[j]?arr[i++]:arr[j++];
        while(i<=m) temp[k++]=arr[i++];
        while(j<=r) temp[k++]=arr[j++];
        for(i=0;i<temp.length;i++) arr[l+i]=temp[i];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        mergeSort(0,n-1);
        System.out.println(count);
    }
}