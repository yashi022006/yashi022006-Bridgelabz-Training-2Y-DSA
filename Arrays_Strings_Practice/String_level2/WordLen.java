import java.util.Scanner;

public class WordLen {

    static String[][] table(String[] w){

        String[][] t=new String[w.length][2];

        for(int i=0;i<w.length;i++){
            t[i][0]=w[i];
            t[i][1]=String.valueOf(w[i].length());
        }

        return t;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String[] w=s.split(" ");

        String[][] t=table(w);

        for(int i=0;i<t.length;i++)
            System.out.println(t[i][0]+" "+t[i][1]);
        sc.close();
    }
}
