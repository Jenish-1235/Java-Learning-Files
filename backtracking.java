import java.util.ArrayList;
import java.util.List;

public class backtracking {

    public static void printPermutation(String str , String perm , int idx) {
        
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newstr, perm + currchar, idx + 1);
        }
    }    
    
    
    // N-Queens, given nxn chessboard , N queens, print all solution where queens are safe.
    public boolean isSafe(int row, int col, char[][] board){
        for (int j = 0 ; j<board.length; j++){
            if (board[row][j] == 'q') {
                return false;
            }
        }
        for (int i = 0 ; i<board.length; i++){
            if (board[i][col] == 'q') {
                return false;
            }
        }

        int r = row;
        for (int c = col; c>=0 && r>=0 ; c--, r--){
            if (board[r][c] == 'q') {
                return false;
            }
        }

        r = row;
        for (int c = col; c<board.length && r>=0; c++, r++ ){
            if (board[r][c] == 'q') {
                return false;
            }
        }

        r = row;
        for (int c = col; c>=0 && r<board.length; r++, c--){
            if (board[r][c] == 'q') {
                return false;
            }
        }

        r = row;
        for (int c = col; c<board.length && r<board.length; r++, c++){
            if (board[r][c] == 'q') {
                return false;
            }
        }

        return true;
        
            
    }

    public void saveBoard(char[][] board , List<List<String>> allBoard){
        String row = "";
        List<String> newboard = new ArrayList<>();

        for(int i =0 ; i<board.length; i++){
            row = "";
            for (int j = 0; j<board[0].length; j++){
                if (board[i][j] == 'q') {
                    row+='q';
                }else{
                    row +='.';
                }
            }
            newboard.add(row);
        }
        allBoard.add(newboard);
    }
    public void helper(char[][] board, List<List<String>> allBoards, int col ){
        
        if (col == board.length) {
            saveBoard(board,allBoards);
            return;
        }
        
        for(int row = 0; row<board.length; row++ ){
            if(isSafe(row,col,board)){
                board[row][col] = 'q';
                helper(board, allBoards, col+1);

                board[row][col] = '.';
            }
        }
    }
    public List<List<String>> solvedQueen(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

    
    public static void main(String[] args) {

        /*
         * backtracking is used when we analyse all possible solution and use the most effective one
         */

        //  String str = "ABC";
        
    }
}
