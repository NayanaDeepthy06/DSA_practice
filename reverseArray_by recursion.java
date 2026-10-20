class Solution {
    

    
    public int[] reverseArray(int[] nums) {
       
          /* reverseArray(0,nums);
           return nums;   
    }
    public void reverseArray(int i,int[] nums){ // this is using recursive helper function 
        int n = nums.length;
        
        if(i>=n/2){
            return;
        }
        int temp = nums[i];
        nums[i] = nums[n-i-1];
        nums[n-i-1] = temp;
        reverseArray(i+1,nums);
        */
        int l = 0;
        int r = nums.length -1;
        while(l<=r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        return nums;  // this is using 2 pointer approach 
    }
}
