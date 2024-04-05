public class loops {
    
    public static void main(String[] args) {
        
        /* three types of loop for loop , while loop and do while loop 
         * 
         */

        // for (initialisation; condition; updation;){ }

        for (int i = 0 ; i<3; i++){
            System.out.println("hello world");
        }

        // while loop :- while(condition){ }
        
        int i = 0;
        while (i<11) {
            System.out.println(i);
            i++;            
        }

        // do while loop :-  do { }while{condition};, used when we need to run the code atleast one without regards to weather condition is true or false.

        do {
            System.out.println(i);
        }while(i<11);


    }
}
