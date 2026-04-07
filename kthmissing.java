// 1539. Kth Missing Positive Number

// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

// Return the kth positive integer that is missing from this array.
class Solution {
    public int findKthPositive(int[] arr, int k) {
        // int n  = arr.length; this is O(n^2) time complexity 
        // ArrayList<Integer> li = new ArrayList<>();
        // for(int i = 1;i<=arr[n-1]+k;i++){
        //     boolean found = false;
        //     for(int j =0;j<n;j++){
        //         if(i==arr[j]){
        //             found = true;
        //             break;
        //         }
        //     }
        //     if(found ==false){
        //         li.add(i);
        //     }
        //     if(li.size()==k){
        //         return li.get(k-1);
        //     }
        // }
        // return li.get(k-1);

        // now this is O(n) time complexity 
        // int n= arr.length;
        // for(int i =0;i<n;i++){
        //     if(arr[i]<=k){
        //         k++;
        //     }else{
        //         break;
        //     }
        // }
        // return k;

        // now lets see binary search approach 
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            int missing = arr[mid]-(mid+1);
            if(missing<k){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return low +k; // or high +1 +k

    }
}
