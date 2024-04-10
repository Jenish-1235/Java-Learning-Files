public class recursion3 {

    public static void printperm(String str , String permutation) {
        for(int i = 0; i<str.length(); i++){
            char currentchar = str.charAt(i);
            // "abc" -> "ab"

            String newstr = str.substring(0, i) + str.substring(i+1);
            printperm(newstr, permutation + currentchar);

        }
    }
    public static void main(String[] args) {
        
    }
}
