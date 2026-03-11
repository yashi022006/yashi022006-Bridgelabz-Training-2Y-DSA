import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generate(String text) {
        System.out.println(text.substring(5, 2));
    }

    static void handle(String text) {
        try {
            System.out.println(text.substring(5, 2));
        }
        catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        }
        catch(RuntimeException e) {
            System.out.println("RuntimeException handled");
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
