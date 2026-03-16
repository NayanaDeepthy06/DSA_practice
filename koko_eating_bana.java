class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int maxele = piles[0];

        for(int i = 0; i < piles.length; i++){
            if(piles[i] > maxele){
                maxele = piles[i];
            }
        }

        int low = 1;
        int high = maxele;
        int ans  = Integer.MAX_VALUE;

        while(low <= high){

            int mid = (low + high) / 2;

            long totalhrs = func(piles, mid, maxele);

            if(totalhrs <= h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }

    private static long func(int[] piles, int hours, int maxele){

        long sum = 0;

        for(int i = 0; i < piles.length; i++){
            sum += (piles[i] + hours - 1) / hours;
        }

        return sum;
    }
}
