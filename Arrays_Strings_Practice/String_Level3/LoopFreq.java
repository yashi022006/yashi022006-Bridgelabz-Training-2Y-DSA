import java.util.Scanner;

public class LoopFreq {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        char[] c=s.toCharArray();

        int[] f=new int[c.length];

        for(int i=0;i<c.length;i++){

            f[i]=1;

            for(int j=i+1;j<c.length;j++){

                if(c[i]==c[j]){
                    f[i]++;
                    c[j]='0';
                }
            }
        }

        for(int i=0;i<c.length;i++)
            if(c[i]!='0')
                System.out.println(c[i]+" "+f[i]);
            sc.close();
    }
}
