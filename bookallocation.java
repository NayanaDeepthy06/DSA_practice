// linear search method in arraylist 
import java.util.*;
import java.util.ArrayList;
public class Solution {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int studentscnt;
        int max = Collections.max(arr);
        if(m>n){
            return -1;
        }
        // lets find the sum of elements in the array list 
        int sum =0;
        for(int num:arr){
            sum+=num;
        }
        for(int i = max;i<=sum;i++){
            studentscnt = Studentscounts(arr,i,m);
            if(studentscnt<=m){
                return i;
            }
        }
        return -1;
    }
    private static int Studentscounts(ArrayList<Integer> arr,int barrier,int students){
        int stucount =1;
        int pages = 0;
        for(int i=0;i<arr.size();i++){
            if((arr.get(i)+pages)<=barrier){
                pages+=arr.get(i);
            }
            else{
                stucount++;
                pages = arr.get(i);
            }
        }
        return stucount;
    }
                        

}
// second method of binary search 
class Solution {
    public int findPages(int[] nums, int m) {
        int n = nums.length;
        int max = nums[0];
        int sum = 0;
        if(m>n){
            return -1;
        }

        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            sum+=nums[i];
        }
        int low = max;
        int high = sum;
        while(low <= high){
            int mid = (low+high)/2;
            if(isPossible(nums,mid,m) == true){
              int ans = mid;
              high = mid-1;
            }else{
                low = mid+1;
            }
    

        }
        return low;// this gives accurate answer or u can u can return ans too 
    }
    private static boolean isPossible(int[] nums,int barrier,int students){
        int stucount = 1;
        int pages = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>barrier){
                return false;
            }
            if(nums[i]+pages<=barrier){
                pages+=nums[i];
            }else{
                stucount++;
                pages = nums[i];
            }
        }
        if(stucount>students){
           return false;
        }else{
            return true;
        }
    }
}
