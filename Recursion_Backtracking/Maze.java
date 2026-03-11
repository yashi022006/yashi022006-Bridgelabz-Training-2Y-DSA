public class Maze {

    static int[][] maze={
        {1,0,0,0},
        {1,1,0,1},
        {0,1,0,0},
        {1,1,1,1}
    };

    static int N=4;

    static int[][] sol=new int[N][N];

    static boolean solve(int r,int c){

        if(r==N-1 && c==N-1){
            sol[r][c]=1;
            return true;
        }

        if(r>=0 && c>=0 && r<N && c<N && maze[r][c]==1){

            sol[r][c]=1;

            if(solve(r+1,c))
                return true;

            if(solve(r,c+1))
                return true;

            sol[r][c]=0;
        }

        return false;
    }

    static void print(){

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
                System.out.print(sol[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args){

        if(solve(0,0))
            print();
        else
            System.out.println("No path");
    }
}
