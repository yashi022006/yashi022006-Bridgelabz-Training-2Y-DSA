import java.util.Scanner;

public class SplitTxt {

    static String[] split(String t){

        int words=1;

        for(int i=0;i<t.length();i++)
            if(t.charAt(i)==' ')
                words++;

        String[] arr=new String[words];

        String w="";
        int k=0;

        for(int i=0;i<t.length();i++){

            if(t.charAt(i)!=' ')
                w+=t.charAt(i);

            else{
                arr[k++]=w;
                w="";
            }
        }

        arr[k]=w;

        return arr;
    }

    static boolean cmp(String[] a,String[] b){

        if(a.length!=b.length) return false;

        for(int i=0;i<a.length;i++)
            if(!a[i].equals(b[i]))
                return false;

        return true;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String t=sc.nextLine();

        String[] a=split(t);
        String[] b=t.split(" ");

        System.out.println("Same: "+cmp(a,b));
        sc.close();
    }
}