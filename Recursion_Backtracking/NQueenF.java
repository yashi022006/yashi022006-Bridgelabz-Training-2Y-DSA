public class NQueenF {

    static int N=4;

    static int[] board=new int[N];

    static boolean[] col=new boolean[N];
    static boolean[] d1=new boolean[2*N];
    static boolean[] d2=new boolean[2*N];

    static boolean[][] bad={
        {false,false,true,false},
        {false,false,false,false},
        {true,false,false,false},
        {false,false,false,false}
    };

    static void solve(int r){

        if(r==N){
            print();
            return;
        }

        for(int c=0;c<N;c++){

            if(bad[r][c]||col[c]||d1[r-c+N]||d2[r+c])
                continue;

            board[r]=c;

            col[c]=true;
            d1[r-c+N]=true;
            d2[r+c]=true;

            solve(r+1);

            col[c]=false;
            d1[r-c+N]=false;
            d2[r+c]=false;
        }
    }

    static void print(){

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){

                if(board[i]==j)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args){

        solve(0);
    }
}
