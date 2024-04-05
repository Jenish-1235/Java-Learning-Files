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


        // switch case statement and break :- switch case statement is used when there are lot of conditions to be checked it maes code more readable and effective and break statement after every case helps in jumping out of switch when case satisfied is executed. for eg.

        switch (age) {
            case 10:
                System.out.println("age is 10");
                break;
        
            default:
                System.out.println("age is not 10"); 
                break;
        }


    }
}
