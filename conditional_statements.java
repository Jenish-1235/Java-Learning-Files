import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args) {
        // keywords 

        /* if, else , else if, switch, break */

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 15) {
            System.out.println("adult");
            
        }else if (age>= 12) {
            System.out.println("little adult");
        }else{
            System.out.println("kid");
        }


    }
}
