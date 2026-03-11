public class Color {

    static int V=4;

    static int[][] g={
        {0,1,1,1},
        {1,0,1,0},
        {1,1,0,1},
        {1,0,1,0}
    };

    static int[] color=new int[V];

    static boolean safe(int v,int c){

        for(int i=0;i<V;i++)
            if(g[v][i]==1 && color[i]==c)
                return false;

        return true;
    }

    static boolean solve(int v,int m){

        if(v==V)
            return true;

        for(int c=1;c<=m;c++){

            if(safe(v,c)){

                color[v]=c;

                if(solve(v+1,m))
                    return true;

                color[v]=0;
            }
        }

        return false;
    }

    public static void main(String[] args){

        int m=3;

        if(solve(0,m)){
            for(int i=0;i<V;i++)
                System.out.print(color[i]+" ");
        }
        else
            System.out.println("No solution");
    }
}
