import java.util.Arrays;
import java.util.Scanner;
public class quicksort {
    void qs(int[]arr,int st,int end){
        if(st>=end){
            return;
        }
        if(st<end){
            int pivIdx = partition(arr,st,end);
            qs(arr,st,pivIdx-1);
            qs(arr,pivIdx+1,end);
        }
    }
    int partition(int arr[],int st,int end){
        int pivot = arr[end];
        int idx = -1;
        for(int j=0;j<end;j++){// aranging elemenst smaller then pivot to left side 
            if(arr[j]<=pivot){
                idx++;
                // swap arr[idx],arr[j]
                int temp = arr[idx];
                arr[idx]=arr[j];
                arr[j]=temp;
            }
        }
        // swap pivot to correct index 
         idx++;
         int temp = arr[idx];
         arr[idx]=arr[end];// arr[end] is pivot 
         arr[end]=temp;
         return idx;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in the array ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the  elements  in  the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("entered array is:"+Arrays.toString(arr));
        quicksort obj = new quicksort();
        obj.qs(arr,0,arr.length-1);
        System.out.println("sorted array is :"+Arrays.toString(arr));
    }
}
