import java.util.*;
class Solution {
    public int secondLargestElement(int[] nums) {
     int n = nums.length;
     int largest = nums[0];
     int sl= Integer.MIN_VALUE;
     for(int i=1;i<n;i++){
        if(nums[i]>largest){
            sl = largest;
            largest=nums[i];
        }
        else if(nums[i]!=largest && nums[i]>sl){
            sl = nums[i];
        }
     }
     return (sl==Integer.MIN_VALUE) ?-1:sl;
    }

    
public static void main(String[] args){    
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] nums = new int[n];
for(int i =0;i<n;i++){
    nums[i]=sc.nextInt();
}
Solution obj = new Solution();
int secondLargest = obj.secondLargestElement(nums);
System.out.println(secondLargest);
}}
