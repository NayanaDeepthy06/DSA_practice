class Solution {
    long prod = 1;
    public long factorial(int n) {
        //your code goes here
        if(n==0){
            return prod;
        }
        prod = prod * n;
        return factorial(n-1);
    }
    
}
