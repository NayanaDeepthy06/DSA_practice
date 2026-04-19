public class Solution {
    public static int isSorted(int n, int []a) {
        int found = -1;
        for(int i =1;i<n;i++){
            if(a[i-1]<=a[i]){
                found = 1;
            }
            else if(a[i-1]>a[i]){
                found = 0;
                break;
            }
        }
        return found;
    }
}
