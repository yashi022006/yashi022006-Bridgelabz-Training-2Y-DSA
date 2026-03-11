import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                if(arr[i] % 2 == 0)
                    System.out.println(arr[i] + " Positive Even");
                else
                    System.out.println(arr[i] + " Positive Odd");
            }
            else if(arr[i] < 0)
                System.out.println(arr[i] + " Negative");
            else
                System.out.println(arr[i] + " Zero");
        }

        if(arr[0] == arr[4])
            System.out.println("First and Last are Equal");
        else if(arr[0] > arr[4])
            System.out.println("First is Greater");
        else
            System.out.println("Last is Greater");
        sc.close();
    }
}
