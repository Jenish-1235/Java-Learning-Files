import java.util.Scanner;

public class recursion {
    
    public static void main(String[] args) {
        printnum(5);

        int sum = 1;
        Scanner sc = new Scanner(System.in);
        int i  = sc.nextInt();
        calcsum(1, sum, i);
    }


    // ?? recursive function to print numbers from 1 to 5
    public static void printnum(int n){
        if ( n == 0) {
            return;
        }else{
            System.out.println(n);
            printnum(n-1);
        }
    }


    // ?? Reursive function to calculate and print the sum of natural numbers upto the given number n ;

    public static void calcsum(int n, int sum, int i) {
        sum = sum + n;
        if (n == i){
            System.out.println(sum);
            return;
        }else{
            calcsum(n+1, sum,i);
        }
    }

    // ?? Recursive Function to calculate and print n factorial.

    public static void calcfact(int n, int sum, int i) {
        sum = sum * n;
        if (n == i) {
            System.out.println(sum);
            return;
        } else {
            calcsum(n + 1, sum, i);
        }
    }


    // ?? Recursive funtion to print x^n with stack height logn
    public static int calcPower(int x , int n) {

        if (n == 0){
            return 1;
        }
        if (x==0) {
            return 0;
        }
        if (n%2 == 0){
            return calcPower(x, n/2) * calcPower(x, n/2);
        }else{
            return calcPower(x, n/2) * calcPower(x, n/2) * x ;
        }
        
    }



}
