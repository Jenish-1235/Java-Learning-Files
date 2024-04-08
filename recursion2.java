public class recursion2 {
    public static void main(String[] args) {
        
        // hanoi tower
        /* 
         * n-1 disk to helper 
         * 1 disk from source to destination 
         */

         int n = 3;
        //  tower(n,"s", "h", "d");
        int[] i = {1,2,7,3,4,5 };
        sorted(0,i);
    }

    // tower of hanoi
    public static void tower(int n , String s , String h , String d) {
        if (n ==1) {
            System.out.println("transfer" + n + "from" + s + "to" + d);
            return;    
        }
        tower(n-1, s, d, h);
        System.out.println("transfer" + n + "from" + s + "to" +  d);
        tower(n-1, h, s, d);
    }

    // print a string in reverse
    // args : str , str.length()-1
    public static void stringrev(String str , int index) {
        if(index == 0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        stringrev(str, index-1);
    }

    // print 1st and last occurence of char in given string
    public static int first = -1;
    public static int last = -1;
    public static void firstlast(String str  , int idx, char chr) {
        if (idx == str.length()-1) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentchar = str.charAt(idx);
        if (currentchar == chr) {
            if (first == -1) {
                first = idx;
            }else{
                last = idx;
            }
        firstlast(str, idx+1, chr);
            
        }
    }
    
    // to check if an array is sorted or not using recursion 
    public static boolean sorted(int index, int[] arrayNum) {
        if (index == arrayNum.length-1) {
            return true;
        }

        if (arrayNum[index] <arrayNum[index+1]) {
            return sorted(index+1, arrayNum);
        }else{
            return false;
        }
    }

    
}

