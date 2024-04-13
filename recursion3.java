import java.util.ArrayList;

public class recursion3 {

    // print permutation of letters of given string
    public static void printperm(String str , String permutation) {
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char currentchar = str.charAt(i);
            // "abc" -> "ab"

            String newstr = str.substring(0, i) + str.substring(i+1);
            printperm(newstr, permutation + currentchar);

        }
    }
    
    
    // count total paths in a maze to move from (0,0) to (n,m) no diagonal movement
    public static int paths(int i , int j ,int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        int downpaths = paths(i+1, j, n, m);
        int rightpaths = paths(i, j+1, n, m);
        return downpaths + rightpaths;
    }
    
    // count no of ways in tiling a floor of nxm length with tile of 1xm 
    public static int tiles(int n, int m){

        if (n == m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticalPlacement = tiles(n-m, m);
        int horizontalPlacement = tiles(n-1, m);

        return horizontalPlacement + verticalPlacement;
    }
    

    // find number of ways in which you can invite n people to your party , single or pairs.
    public static int guestcall(int n){
        if (n <= 1){
            return 1;
        }
        int singlecall = guestcall(n-1);
        int paircall = (n-1) * guestcall(n-2);
        return singlecall + paircall;
    }
    
    
    // print all subset of a set of first n natural numbers
    public static void findsubset(int n, ArrayList<Integer> subset){

        if (n==0){
            for(int i = 0; i<subset.size(); i++){
                System.out.print(subset.get(i) + " ");
            }
            System.out.println();
        }
        subset.add(n);
        findsubset(n-1, subset);

        subset.remove(subset.size() - 1);
        findsubset(n-1, subset);
    }
    public static void main(String[] args) {
        // printperm("abc", "");

        // int totalpath = paths(0, 0, 3, 4);
        // System.out.println(totalpath);
    }
}
