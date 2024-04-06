public class bit_manipulation {
    public static void main(String[] args) {
        // Left and right shift operator
        /*
         *  1. left shift :- all bits shift to left and 0 are added at the end 
         * 2. right shift :- all bits shift to right and 0 are added at start
         * 
        */

        // methods of bit manipulation:-
        /* position are counted from right side  , with index zero 
         * process:- create bit mask and perform function
         * 
         * 
         * Get Bit Method:- 
         * bitmasking means  1<< i  (i is position of bit)
         * then perform AND operation on original number and bit  mask number.
         * 
         * if resultant is non zero  :- then required bit is 1 and  if resultant is zero :- then required bit is 0.
         * 
         * Set Bit :- same process now operation is     OR
         * 
         * Clear Bit :- means making the bit of given position 0. process is same operation is AND with NOTof bitmask. NOT of bitmask is all zeroes turned to 1 and all ones turned to 0.
         * 
         * Update Bit :- changes the given position bit with given number:- 
         * 
         * if we want to update to 1 :-   we perform OR operation 
         * if we want to updatet to 0 :- we perform AND with NOT
        */
    }
}
