import java.util.Scanner;

public class StringIndexExceptionDemo {

    static void generate(String text) {
        System.out.println(text.charAt(text.length() + 2));
    }

    static void handle(String text) {
        try {
            System.out.println(text.charAt(text.length() + 2));
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        try {
            generate(text);
        }
        catch(Exception e) {
            System.out.println("Exception occurred");
        }

        handle(text);
    }
}