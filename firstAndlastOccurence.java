class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int n =  nums.length;
        // // by linear search method 
        // int first = -1;
        // int last = -1;
        // for(int i =0;i<n;i++){
        //     if(nums[i]==target){
        //         if(first==-1){
        //             first = i;
        //         }
        //         last =i;
        //     }
        // }
        // return new int[]{first,last};
        // method 2 by lower and upper bound 
           int n = nums.length;

        int lb = findlb(nums, target, n);
        int ub = findub(nums, target, n);

        if (lb == n || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lb, ub - 1};
    }

    private static int findlb(int[] nums, int target, int n) {
        int low = 0, high = n - 1;
        int lb = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] >= target) {
                lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return lb;
    }

    private static int findub(int[] nums, int target, int n) {
        int low = 0, high = n - 1;
        int ub = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] > target) {
                ub = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ub;
    }
       
}
