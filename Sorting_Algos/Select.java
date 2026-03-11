import java.util.*;

public class Select {

    static void sort(int[] a){

        for(int i=0;i<a.length-1;i++){

            int min=i;

            for(int j=i+1;j<a.length;j++)
                if(a[j]<a[min])
                    min=j;

            int t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
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
