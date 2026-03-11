public class Sudoku {

    static int[][] board = {
        {3,0,6,5,0,8,4,0,0},
        {5,2,0,0,0,0,0,0,0},
        {0,8,7,0,0,0,0,3,1},
        {0,0,3,0,1,0,0,8,0},
        {9,0,0,8,6,3,0,0,5},
        {0,5,0,0,9,0,6,0,0},
        {1,3,0,0,0,0,2,5,0},
        {0,0,0,0,0,0,0,7,4},
        {0,0,5,2,0,6,3,0,0}
    };

    static boolean safe(int r,int c,int n){

        for(int i=0;i<9;i++)
            if(board[r][i]==n || board[i][c]==n)
                return false;

        int sr=r-r%3;
        int sc=c-c%3;

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                if(board[sr+i][sc+j]==n)
                    return false;

        return true;
    }

    static boolean solve(){

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){

                if(board[r][c]==0){

                    for(int n=1;n<=9;n++){

                        if(safe(r,c,n)){

                            board[r][c]=n;

                            if(solve())
                                return true;

                            board[r][c]=0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static void print(){

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){

        solve();
        print();
    }
}