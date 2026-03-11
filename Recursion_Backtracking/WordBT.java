public class WordBT {

    static char[][] g={
        {'C','A','T','S'},
        {'O','R','E','A'},
        {'D','E','A','M'},
        {'E','L','L','S'}
    };

    static boolean[][] vis=new boolean[4][4];

    static int[] dr={-1,-1,-1,0,0,1,1,1};
    static int[] dc={-1,0,1,-1,1,-1,0,1};

    static boolean search(int r,int c,String w,int i){

        if(i==w.length())
            return true;

        if(r<0||c<0||r>=4||c>=4||vis[r][c]||g[r][c]!=w.charAt(i))
            return false;

        vis[r][c]=true;

        for(int k=0;k<8;k++)
            if(search(r+dr[k],c+dc[k],w,i+1))
                return true;

        vis[r][c]=false;

        return false;
    }

    public static void main(String[] args){

        String word="DREAM";

        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                if(search(i,j,word,0)){
                    System.out.println("Found");
                    return;
                }

        System.out.println("Not Found");
    }
}
