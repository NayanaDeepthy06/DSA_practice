import java.util.*;
public class binarysearch {
    static void bs(int[] arr,int target){// for static u dont need to create the object of the class to call the method
        int low = 0;
        int high = arr.length -1;
    
        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid]== target){
                System.out.println("target elemnt is found at index :"+mid);
                return;
            }else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }

    }
    System.out.println("target element is not found in the array ");

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
        bs(arr,target);
    }
}
