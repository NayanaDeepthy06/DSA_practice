// finding nth root of a number the nth root value can be decimal 
//Given two numbers N and M, find the Nth root of M. The Nth root of a number M is defined as a number
//  X such that when X is raised to the power of N, it equals M.
// here we are finding decimal value of nth root of m using binary search 
import java.util.*;

public class Nthroot{

    public double findNthRoot(int n,int m){
        double low = 0;   // changed from 1 to 0 so it works even if m < 1
        double high = m;
        double eps = 1e-6;// that is equal to 10 ^-6

        while(high-low>eps){
            double mid = (low+high)/2.0;
            double pro = 1.0;

            for(int i =1;i<=n;i++){
                pro*=mid;
                if(pro>m){
                    break;
                }
            }

            if(pro<m){
                low = mid;// here we need decimal value so take low as mid 
            }
            else{
                high = mid;
            }
        }

      return low;// by dry ruunig this with example u will get to know why we have returned low here 
    }

 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int  n = sc.nextInt();
    int m = sc.nextInt();

    Nthroot obj = new Nthroot();
    double ans  = obj.findNthRoot(n,m);

    System.out.println("the nth root is "+ans);

    sc.close();
 }
}