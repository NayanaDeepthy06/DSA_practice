
import java.util.Scanner;


public class print_1toN {
    
    // public void print1toN(int n,int count){
    //     if(count>n){
    //         return;
    //     }
    //     System.out.println(count);
    //     count++;
    //     print1toN(n, count); /// this is tail recursion  using is a count variable 



    // }
    // lets see the head  recursion without using the count variable  this is using head recursion 
    public static void print1toN(int n){
        if(n==0){
            return;
        }
        print1toN(n-1);
        System.out.println(n);

        
    }
    public static void main(String[] args) {
        // int count = 1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number n ");
        int n = sc.nextInt();
        // print_1toN obj = new print_1toN();
        // obj.print1toN(n, count);
        print1toN(n);

    }
}
