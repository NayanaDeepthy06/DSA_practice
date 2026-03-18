// this is method one time complexity is approx O(n^2)
class Solution {
    // private int find_days(int[] weights,int cap,int days){
    //     int daycount = 1;
    //     int load = 0;
    //     for(int i =0;i<weights.length;i++){
    //         if(load+weights[i]>cap){
    //             daycount = daycount+1;
    //             load = weights[i];
    //         }
    //         else{
    //             load = load +weights[i];
    //         }
    //     }
    //     return daycount;

    // }
    // public int shipWithinDays(int[] weights, int days) {
    //     int n  = weights.length;
    //     // fisrst we will find max package weight in the array
    //     // and sum of weights of all packages in the array 
    //     int max = weights[0];
    //     int sum  =0;
    //     for(int num :weights){
    //         sum+=num;
    //         if(num>max){
    //             max = num;
    //         }
    //     }
    //     for(int i =max;i<=sum;i++){
    //         int daysreq = find_days(weights,i,days);
    //         if(daysreq<=days){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }  this is method 1 lets see the method 2 
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int max = weights[0];
        int sum  = 0;
        for(int num:weights){
            sum+=num;
            if(num>max){
                 max  = num;
            }
        }
        int low = max;
        int high = sum;
        int ans = -1;
        while(low<=high){
            int mid = (low + high)/2;
            int daysreq = find_days(weights,mid,days);
            if(daysreq<=days){
               ans  =mid;
               high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;// or return low;
    }
    private static int find_days(int[] weights,int cap,int days){
        int load = 0;
        int day_count  =0;
        for(int i =0;i<weights.length;i++){
            if(load+weights[i]>cap){
                load+=weights[i];
                day_count = day_count+1;

            }
            else{
                load = load + weights[i];
            }
        }
      return day_count;
    }
}
}
