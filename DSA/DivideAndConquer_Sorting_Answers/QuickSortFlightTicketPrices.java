import java.util.*;
public class QuickSortFlightTicketPrices {
    static void quickSort(long[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    static int partition(long[] arr,int low,int high){
        long pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                long temp=arr[i]; arr[i]=arr[j]; arr[j]=temp;
            }
        }
        long temp=arr[i+1]; arr[i+1]=arr[high]; arr[high]=temp;
        return i+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] prices=new long[n];
        for(int i=0;i<n;i++) prices[i]=sc.nextLong();
        quickSort(prices,0,n-1);
        System.out.println(Arrays.toString(prices));
    }
}