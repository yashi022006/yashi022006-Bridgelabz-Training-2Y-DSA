import java.util.Scanner;

public class VowCon {

    static String type(char c){

        if(c>='A' && c<='Z')
            c=(char)(c+32);

        if(c>='a' && c<='z'){

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                return "V";
            else
                return "C";
        }

        return "N";
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        int v=0,c=0;

        for(int i=0;i<s.length();i++){

            String t=type(s.charAt(i));

            if(t.equals("V")) v++;
            if(t.equals("C")) c++;
        }

        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        sc.close();
    }
}