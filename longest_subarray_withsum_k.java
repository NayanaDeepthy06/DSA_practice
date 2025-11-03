class longest_subarray_withsum_k {
    public int longestSubarray(int[] nums, int k) {
       // int n = nums.length;
       // int left = 0;
       // int right = 0;
       // int sum = nums[0];
       // int maxLength = 0;
       // while(right<n){
       //   while(left<=right &&sum > k){
       //      sum-=nums[left];
       //      left++;
       //   }
       //   if(sum==k){
       //      maxLength = Math.max(maxLength,right-left+1);
       //   }
       //   right++;
       //   if(right<n){
       //   sum+= nums[right];
       //   }
       // }
       // return maxLength; // this is first approach for only +ves and 0's
    // second approach using hash map works for all numbers 
    int n =  nums.length;
    long sum =0;
    int maxLen = 0;
    Map<Long,Integer> presum = new HashMap<>();
    for(int i = 0;i<n;i++){
        sum+=nums[i];
     if(sum == k){
        maxLen = i+1;
     }
     long rem = sum - k;
     if(presum.containsKey(rem)){
        int len = i - presum.get(rem);
        maxLen = Math.max(maxLen,len);
     }
     if(!presum.containsKey(sum)){
        presum.put(sum,i);
     }
    }
    return maxLen;
    }
}
