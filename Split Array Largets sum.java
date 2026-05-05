class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int min = nums[0];
        int sum = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            sum+=nums[i];
        }
        int low = min;
        int high = sum;
        if(n==1){
            return nums[0];
        }
        while(low<=high){
            int mid = (low + high)/2;
            if(isPossible_to_split(nums,mid,k)==true){
                int ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
      return low;
        
    }
    private static boolean isPossible_to_split(int[] nums,int maxsum,int k){
        int no_of_partitions = 1;
         int sum_elements = 0 ;
         for(int i=0;i<nums.length;i++){
            if(nums[i]>maxsum) return false;
            if(nums[i]+sum_elements<=maxsum){
                sum_elements+=nums[i];
            }else{
                no_of_partitions++;
                sum_elements = nums[i];
            }
         }
         if(no_of_partitions>k){
            return false;
         }else{
            return true;
         }
    }
}
