import java.util.Scanner;

public class CharFreq {

    static String[][] freq(String s){

        int[] f=new int[256];

        for(int i=0;i<s.length();i++)
            f[s.charAt(i)]++;

        int count=0;

        for(int i=0;i<256;i++)
            if(f[i]>0)
                count++;

        String[][] res=new String[count][2];

        int k=0;

        for(int i=0;i<256;i++)
            if(f[i]>0){
                res[k][0]=String.valueOf((char)i);
                res[k][1]=String.valueOf(f[i]);
                k++;
            }

        return res;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String[][] r=freq(s);

        for(int i=0;i<r.length;i++)
            System.out.println(r[i][0]+" "+r[i][1]);
        sc.close();
    }
}
