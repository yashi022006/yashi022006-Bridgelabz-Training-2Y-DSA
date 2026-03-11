import java.util.Scanner;

public class FirstNonRep {

    static char find(String s){

        int[] f=new int[256];

        for(int i=0;i<s.length();i++)
            f[s.charAt(i)]++;

        for(int i=0;i<s.length();i++)
            if(f[s.charAt(i)]==1)
                return s.charAt(i);

        return '0';
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        char c=find(s);

        if(c!='0')
            System.out.println("First Non-Repeating: "+c);
        else
            System.out.println("None");
        sc.close();
    }
}