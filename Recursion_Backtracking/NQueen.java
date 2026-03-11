public class NQueen {

    static int N=8;

    static int[] board=new int[N];

    static boolean[] col=new boolean[N];
    static boolean[] d1=new boolean[2*N];
    static boolean[] d2=new boolean[2*N];

    static boolean solve(int r){

        if(r==N){
            print();
            return true;
        }

        for(int c=0;c<N;c++){

            if(col[c]||d1[r-c+N]||d2[r+c])
                continue;

            board[r]=c;

            col[c]=true;
            d1[r-c+N]=true;
            d2[r+c]=true;

            if(solve(r+1))
                return true;

            col[c]=false;
            d1[r-c+N]=false;
            d2[r+c]=false;
        }

        return false;
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
    }

    public static void main(String[] args){

        solve(0);
    }
}