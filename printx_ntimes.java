
import java.util.Scanner;

public class printx_ntimes {
    public void printntimes(int x,int n){
        if(n ==0){
            return;
        }
        System.out.println(x);
        n = n-1;
        printntimes(x, n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit u want to print n times ");
        int x = sc.nextInt();
        System.out.println("Enter the number of times u want o print that digit ");
        int n = sc.nextInt();
       printx_ntimes obj = new printx_ntimes();
       obj.printntimes(x, n);

    }
}
