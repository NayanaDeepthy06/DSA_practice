import java.util.*;
public class Twos_sum {
    public String twoSum(int[] nums,int target){
        int n = nums.length;
        int left = 0;
        int right = n-1;
        Arrays.sort(nums);
        while(left<=right){
            if(nums[left]+nums[right]==target){
                return "Yes";
            }
            else if(nums[left]+nums[right]<target){
            left++;
            }
            else{
                right--;
            }
    }
    return "NO";
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of elements in the array");
    int n = sc.nextInt();
    int[] nums = new int[n];
    System.out.println("enter the elements in the array");
    for(int i =0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    System.out.println("enter the target element");
    int target = sc.nextInt();
    Twos_sum obj = new Twos_sum();
    System.out.println(obj.twoSum(nums,target));
} 
}
