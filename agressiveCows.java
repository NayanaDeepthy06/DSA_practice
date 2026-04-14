class Solution {
    public int aggressiveCows(int[] nums, int k) {
       int n  = nums.length;
       // sort the array 
       Arrays.sort(nums);
       // the range is between 1 and max element - min element in the arary 
       int max =nums[n-1];
       int min = nums[0];
       for(int i =1;i<=max- min;i++){
        if(cowsplace(nums,i,k)==true){
            continue;
        }
        else{
            return i-1;
        }
       }
       return max-min;
    }
    private static boolean cowsplace(int[] nums,int dist,int k){
        int cowscount = 1;
        int last = nums[0];
        for(int j =1;j<nums.length;j++){
            if(nums[j]-last >=dist){
                cowscount++;
                last = nums[j];
            }
        }
        if (cowscount>=k){
            return true;
        }
        else{
            return false;
        }
    }
} /// this is aprroach one takes O(n^2 ) as time complexity 
this is binary search approach 
    class Solution {
    public int aggressiveCows(int[] nums, int k) {
      int n = nums.length;
      Arrays.sort(nums);
      int low = 1;
      int high = nums[n-1];
      int ans; 
      while(low<=high){
        int mid = (low+high)/2;
        if(Cowsplace(nums,mid,k)==true){
            ans = mid;
            low = mid+1;
        }else{
            high = mid-1;
        }
      }
      return high;
    }
    private static boolean Cowsplace(int[] nums,int dist,int k){
        int countCows = 1;
        int last = nums[0];
        for(int j=0;j<nums.length;j++){
            if(nums[j]-last>=dist){
                countCows++;
                last = nums[j];
            }
        }
        if (countCows>=k) return true;
        else{
            return false;
        }
    }
}
