//Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray.
//A subarray is a contiguous non-empty sequence of elements within an array
import java.util.*;
class kadanes_algo{
    public int largestsum_subarray(int[] nums){
        int n = nums.length;
        int sum =0;
        int maxi = Integer.MIN_VALUE;
        int start = 0;
        int ansstart =-1;
        int ansend =-1;
        for(int i =0;i<n;i++){
            if(sum == 0){
                start = i;
            }
            sum += nums[i];
            if(sum>maxi){
                maxi = sum;
                ansstart = start;
                ansend = i;
        
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println("lets print the maximum subarray");
        int[] arr = new int[ansend-ansstart+1];
        for(int i = ansstart;i<=ansend;i++){
            arr[i-ansstart] = nums[i];
        }
        System.out.println(Arrays.toString(arr));
        return maxi;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements in the array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("enter the elements in the array");
        for(int i =0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        kadanes_algo obj = new kadanes_algo();
        System.out.println(obj.largestsum_subarray(nums));
        
    }
}