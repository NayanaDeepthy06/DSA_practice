import java.util.*;

public class bs_recursive {
    int  bs(int[]arr,int low,int high,int target){
        if(low>high){
            return -1;
        }
        int mid =(low+high)/2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[mid]<target){
            return bs(arr,mid+1,high,target);
        }
        return bs(arr,low,mid-1,target);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemnts in the array ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter the  elements in sorted order in  the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("entered array is:"+Arrays.toString(arr));
        System.out.println("enter the target element");
        int target = sc.nextInt();
        // bs(arr,low,high,target);
        bs_recursive obj = new bs_recursive();
        int low =0;
        int high = arr.length -1;
        int ind = obj.bs(arr,low,high,target);
        if(ind ==-1){
            System.out.println("element is not found in the array");
        }
        System.out.println("element is found at index :"+ind);
    }
}
