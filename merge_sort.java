import java.util.Arrays;
import java.util.Scanner;

public class merge_sort {
    int temp[];
    void mergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int mid =(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    void merge(int arr[],int low,int mid,int high){
        int left = low;
        int right = mid+1;
        int i =low;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i]=arr[left];
                left++;
                
            }
            else{
                temp[i]=arr[right];
                right++;
                
            }
            i++;
           }
            while(left<=mid){
                temp[i]=arr[left];
                left++;
                i++;
            }
            while(right<=high){
                temp[i]=arr[right];
                right++;
                i++;
            }
            for(int j =low;j<=high;j++){
                arr[j]=temp[j];
            }

            
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
        merge_sort obj = new merge_sort();
        obj.temp = new int[n];
        obj.mergeSort(arr, 0, n-1);
        System.out.println("sorted array is :"+Arrays.toString(arr));
    }
}

