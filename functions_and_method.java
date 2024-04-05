/**
 * functions_and_method
 */
public class functions_and_method {

    public static void main(String[] args) {
        
        // functions are block of code, that takes input, does work and produces some output.
        // return type in java function is of single type and void word is used when function doesnt return anything.
        // function name can be anything , but not keyword of java.
        // argument can be multiple and and of different data type.
        // then goes code
        // return keyword is used to return value from funnction 
        // function needs to be called
        // returntype name(arguments){ }

        // function and method have very small difference , functions are called directly while methods are called through object of a class.

        String name = "Jenish";
        example_functions(name);

    }

    public static void example_functions (String name) {
        System.out.println(name);
        return;
    }
}