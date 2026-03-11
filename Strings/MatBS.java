import java.util.*;

public class MatBS{

    static boolean find(int[][] m,int t){

        int r=m.length,c=m[0].length;

        int l=0,h=r*c-1;

        while(l<=h){

            int mid=(l+h)/2;

            int row=mid/c;
            int col=mid%c;

            if(m[row][col]==t)
                return true;

            if(m[row][col]<t)
                l=mid+1;
            else
                h=mid-1;
        }

        return false;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();

        int[][] m=new int[r][c];

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                m[i][j]=sc.nextInt();

        int t=sc.nextInt();

        System.out.println(find(m,t));
        sc.close();
    }
}
