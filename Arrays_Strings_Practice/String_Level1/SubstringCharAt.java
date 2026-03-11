import java.util.Scanner;

public class SubstringCharAt {

    static String createSubstring(String text, int start, int end) {
        String result = "";

        for(int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    static boolean compare(String a, String b) {
        if(a.length() != b.length())
            return false;

        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String s1 = createSubstring(text, start, end);
        String s2 = text.substring(start, end);

        boolean result = compare(s1, s2);

        System.out.println("charAt substring: " + s1);
        System.out.println("built-in substring: " + s2);
        System.out.println("Same: " + result);
        sc.close();
    }
}