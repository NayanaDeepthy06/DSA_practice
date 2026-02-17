import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Write your code here.
      int floor = -1;
      int ceil = -1;
      int low = 0;
      int high = n-1;
      
      // finding floor value 
      while(low<=high){
        int mid = (low + high)/2;
        if(a[mid]<=x){
            floor = a[mid];
            low = mid + 1;
        }
        else{
          high = mid - 1;
        }
      }
      // finding ceil value 
      low = 0;
      high = n-1;
      while(low<=high){
        int mid = (low+high)/2;
        if(a[mid]>=x){
        ceil = a[mid];
        high = mid -1;
        }
        else{
          low = mid +1;
        }
      }
      // int[] arr = new int[2];
      // arr[0] = floor;
      // arr[1] = ceil;
      // return arr;
      return new int[]{floor,ceil};
    }
    
}
