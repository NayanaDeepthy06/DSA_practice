class longest_subarray_withsum_k {
    public int longestSubarray(int[] nums, int k) {
       int n = nums.length;
       int left = 0;
       int right = 0;
       int sum = nums[0];
       int maxLength = 0;
       while(right<n){
         while(left<=right &&sum > k){
            sum-=nums[left];
            left++;
         }
         if(sum==k){
            maxLength = Math.max(maxLength,right-left+1);
         }
         right++;
         if(right<n){
         sum+= nums[right];
         }
       }
       return maxLength;
    }
}