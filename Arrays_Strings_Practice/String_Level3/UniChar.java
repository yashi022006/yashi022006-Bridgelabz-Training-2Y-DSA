import java.util.Scanner;

public class UniChar {

    static char[] unique(String s){

        char[] temp=new char[s.length()];
        int k=0;

        for(int i=0;i<s.length();i++){

            boolean flag=true;

            for(int j=0;j<i;j++)
                if(s.charAt(i)==s.charAt(j))
                    flag=false;

            if(flag)
                temp[k++]=s.charAt(i);
        }

        char[] res=new char[k];

        for(int i=0;i<k;i++)
            res[i]=temp[i];

        return res;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        char[] u=unique(s);

        for(char c:u)
            System.out.print(c+" ");
        sc.close();
    }
}
