class Solution {
    public int paint(int A, int B, int[] C) {
        int n= C.length;
        int max = C[0];
        long sum = 0;
        for(int i=0;i<n;i++){
            if(C[i]>max){
                max = C[i];
            }
            sum+=C[i];
        }
        if(A>n){
            return (int)(((long)max*B)%10000003);
        }
        long low = max;
        long high = sum;
        long ans =0;
        while(low<=high){
            long mid = (low + high)/2;
            if(isPoss_ofPainting(C,mid,A)== true){
                 ans = mid;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return (int)((ans*B)%10000003);
    }
    private static boolean isPoss_ofPainting(int[] C,long len,int Painters){
        int p = 1;
        long p_len = 0;
        for(int i =0;i<C.length;i++){
            if(p_len+C[i]<=len){
                p_len+=C[i];
            }else{
                p++;
                p_len = C[i];
            }
        }
        if(p<=Painters){
            return true;
        }else{
            return false;
        }
    }
}
