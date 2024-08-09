package Week4;

public class solveNQueen {
    static boolean check(int[][] board, int i, int j, int n){
        //chk vertical and horizontal at same time in the board
        for(int x=0;x<n;x++){
            if(board[x][j]==1 || board[i][j]==1){
                return false;
            }
        }
        //chk diagonals upper
        int x=i, y=j;
        //left diagonal
        while(x>=0 && y>=0){
            if(board[x][y]==1){
                return false;
            }
            x--;
            y--;
        }
        //right diagonal
        while(i>=0 && j<n){
            if(board[i][j]==1){
                return false;
            }
            i--;
            j++;
        }
        //place is safe
        return true;
    }
    static boolean NQueen(int[][] board,int i,int n){
        //base case
        if(i==n){
            //display the matrix
            for(int x=0;x<n;x++){
                for(int y=0;y<n;y++){
                    System.out.print(board[x][y]);
                }
                System.out.println();
            }
            System.out.println();
            return false;
        }
        for(int j=0;j<n;j++){
            if(check(board,i,j,n)){
                board[i][j]=1;
                if(NQueen(board,i+1,n)){
                    return true;
                }
                //backtracking
                board[i][j]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n=4;
        int[][] board=new int[n][n];
        NQueen(board,0,n);
    }
}
