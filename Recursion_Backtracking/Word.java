public class Word {

    static char[][] g={
        {'A','B','C','E'},
        {'S','F','C','S'},
        {'A','D','E','E'}
    };

    static boolean dfs(int r,int c,String w,int i){

        if(i==w.length())
            return true;

        if(r<0||c<0||r>=3||c>=4||g[r][c]!=w.charAt(i))
            return false;

        char t=g[r][c];
        g[r][c]='#';

        boolean f = dfs(r+1,c,w,i+1) ||
                    dfs(r-1,c,w,i+1) ||
                    dfs(r,c+1,w,i+1) ||
                    dfs(r,c-1,w,i+1);

        g[r][c]=t;

        return f;
    }

    public static void main(String[] args){

        String w="ABCCED";

        for(int i=0;i<3;i++)
            for(int j=0;j<4;j++)
                if(dfs(i,j,w,0)){
                    System.out.println("Found");
                    return;
                }

        System.out.println("Not Found");
    }
}
