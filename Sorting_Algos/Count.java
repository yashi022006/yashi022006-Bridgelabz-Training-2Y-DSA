import java.util.*;

public class Count {

    static void sort(int[] a){

        int max=18;

        int[] c=new int[max+1];

        for(int x:a)
            c[x]++;

        int k=0;

        for(int i=0;i<=max;i++)
            while(c[i]-- >0)
                a[k++]=i;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        sort(a);

        for(int x:a)
            System.out.print(x+" ");
        sc.close();
    }
}
