import java.io.*;
import java.util.*;

public class WordCnt{

    public static void main(String[] args) throws Exception{

        Scanner sc=new Scanner(System.in);

        String target=sc.nextLine();

        BufferedReader br=new BufferedReader(new FileReader("test.txt"));

        int count=0;
        String line;

        while((line=br.readLine())!=null){

            String[] w=line.split(" ");

            for(String x:w)
                if(x.equals(target))
                    count++;
        }

        br.close();

        System.out.println(count);
        sc.close();
    }
}
