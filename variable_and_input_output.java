import java.util.*;

class variables_and_input_output{

    public static void main(String[] args) {

        // output

        // print function do not give \n after line white println function automatically gives \n
        System.out.print("Hello World");
        System.out.println("Hii world");   //   \n is escape character called new line character
        

        // Variables in java 
        /* java is a typed language so we need to declare the data type of variable initially. 
        There are 8 primitive data types and 5 non primitive data types.

        primitive data types :- 
        1.byte
        2.short
        3.char
        4.boolean
        5.int
        6.long
        7.float
        8.double

        non-primitive data types:- 
        1. string
        2.array
        3.class
        4.object
        5.interface
        */ 

        int a = 10;
        int b = 20; 
        int c = a + b ;
        System.out.println(c);
        

        // input

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        /*
        for input we use scanner object from scanner class of java utils which takes input from user.
        
        next delimits at space
        nextLine function takes whole line
        nextInt function for int input
        nextFloat for float input
        we have more such functions too.

         */
        System.out.println(s);
        
        
    }
}