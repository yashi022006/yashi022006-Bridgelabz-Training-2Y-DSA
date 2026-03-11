import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for(int i = 0; i < number; i++) {
            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();

            if(personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Enter positive values");
                i--;
            }
        }

        for(int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            if(bmi < 18.5)
                weightStatus[i] = "Underweight";
            else if(bmi < 25)
                weightStatus[i] = "Normal";
            else if(bmi < 30)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        for(int i = 0; i < number; i++) {
            System.out.println(personData[i][0] + " " +
                               personData[i][1] + " " +
                               personData[i][2] + " " +
                               weightStatus[i]);
        }
        sc.close();
    }
}
