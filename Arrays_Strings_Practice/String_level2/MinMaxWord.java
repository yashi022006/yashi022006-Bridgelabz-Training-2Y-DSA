import java.util.Scanner;

public class MinMaxWord {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        String[] w=s.split(" ");

        int min=0,max=0;

        for(int i=1;i<w.length;i++){

            if(w[i].length()<w[min].length())
                min=i;

            if(w[i].length()>w[max].length())
                max=i;
        }

        System.out.println("Shortest: "+w[min]);
        System.out.println("Longest: "+w[max]);
        sc.close();
    }
}
