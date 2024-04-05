import java.util.Scanner;

public class strings {
    
    public static void main(String[] args) {
        // declaration
        /*
        String are immutable in java.
         * String name = "asdvs";
         */
        
        Scanner sc = new Scanner(System.in);

        // input string
        String name = sc.next();
        // next uses space as delimiter
        String name2 = sc.nextLine();
        // nextLine function takes whole lines


        // concatenation
        // it helps in merging strings
        //  + operator is used


        /*
         *  String length method  :- name.length()
         * gives length of strength
         * 
         * charAt method :- we use loop and charAt method with looping variable iteration.
         * for (int i = 0 ; i<name.length() ;i++){sout("name.charAt(i)")}
         * 
         */

        // comparison of string:- name.compareTo(name2) ,,,   s1>s2 positive value , s1<s2 negative value , s1 == s2 0 .
        // comparison is done on the basis of character. i.e. A<B<C.....
        //  == is used when we have to compare similar strings but it fails multiple cases so we use compareTo method.
        

        // to get substring of string :- 
        /*
         * we use substring method, takes argument beginning and ending index , where ending index is exclusive.
         * if not given ending index , default is last index.
         */

        // parsing int from string. 
        // String a = "123";
        // int b = Integer.parseInt(a);


        // **************************** String Builder class. *********************** //
        /*
         * String builder declaration:- 
         * StringBuilder sb = new StringBuilder("Tony")
         * sout(sb)
         * 
         * method in StringBuilder:-
         * 
         * charAt(index)
         * setCharAt(index, character)
         * insert(index, character)
         * delete(start index , end index (exclusive))
         * append(string)
         * length()
         */
    }
}
