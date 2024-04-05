import java.util.Scanner;
import java.util.*;
public class question_practice_of_basic_java {
    public static void main(String[] args) {

    }

    public static void question1(){
        System.out.println("Question 1");
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        int avg = sum/3;
        System.out.println(avg);
    }
    public static void question2() {
        System.out.println("Question 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i <=n; i++){
            if (i%2 != 0) {
                sum = sum + i;
            }
        }

        System.out.println(sum);

    }

    public static int question3() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greater;
        if (a > b) {
            System.out.println("a is greater");
            System.out.println(a);
            greater = a;
            
        }else{
            System.out.println(" b is greater ");
            System.out.println(b);
            greater = b;
        }
        return greater;
    }

    public static double question4() {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        double circumference = 2 * 3.14 * radius;
        System.out.println("radius of circle is " + circumference);
        return circumference;
    }

    public static String question5() {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>18) {
            return "eligible to vote";
        }else{
            return "ineligible";
        }
    }

    public static void question6() {
        int i = 0;
        do{
            System.out.println("this is an infinite loop using do while loop");
        }while(i == 0);
    }

    public static void question7() {
        System.out.println("Enter number of numbers you want to enter");
        Scanner sc = new Scanner(System.in);
        int numberOfNumbers = sc.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < numberOfNumbers; i++){
            int enteredNumber = sc.nextInt();
            if (enteredNumber == 0) {
                zeroCount = zeroCount + 1;
            }else if (enteredNumber > 0 ){
                positiveCount = positiveCount + 1;
            }else{
                negativeCount = negativeCount + 1;
            }
        }

        System.out.println("positives" + positiveCount);
        System.out.println("negatives" + negativeCount);
        System.out.println("zeroes" + zeroCount);
    }

    public static void question8() {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double  n = sc.nextInt();

        double ans = Math.pow(x, n);
        System.out.println(ans);
    }

    public static void question9() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int min = Math.min(x, y);
        int hcf = 1;
        for(int i = 1; i  <= min; i++){
            if (x%i == 0 & y%i ==0) {
                hcf = i;
            }
        }
        System.out.println("HCF" + hcf);
    }

    public static void question10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < n - 2; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}
