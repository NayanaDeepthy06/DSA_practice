public class Solution {
    public static int smallestDivisor(int arr[], int limit) {
        int n = arr.length;
        if(n>limit) return -1;
        int max = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int low = 1;
        int high = max;
        int ans = -1;
        while(low<=high){
            int mid =(low+high)/2;
            if(sum_of_div(arr,mid,limit)){
                ans = mid;
                high = mid-1;// since we need to find smallest divisor 
            }
            else{
                low = mid + 1;
            }
        }
        return low;// or return ans 
        
    }
    public static boolean sum_of_div(int[] arr,int divisor,int limit){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum+= Math.ceil((double)arr[i]/divisor);
            // sum += (arr[i]+divisor-1)/divisor;
        }
        if(sum<=limit){
            return true;
        }
        else{
            return false;
        }
    }
}
