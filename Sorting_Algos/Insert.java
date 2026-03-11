import java.util.*;

public class Insert {

    static void sort(int[] a){

        for(int i=1;i<a.length;i++){

            int key=a[i];
            int j=i-1;

            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }

            a[j+1]=key;
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