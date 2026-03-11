import java.util.*;

public class DupSB{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        HashSet<Character> set=new HashSet<>();

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);

            if(!set.contains(c)){
                sb.append(c);
                set.add(c);
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
