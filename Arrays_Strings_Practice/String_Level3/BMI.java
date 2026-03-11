import java.util.Scanner;

public class BMI {

    static String[][] calc(double[][] data){

        String[][] res = new String[10][4];

        for(int i=0;i<10;i++){

            double w = data[i][0];
            double h = data[i][1]/100.0;

            double bmi = w/(h*h);

            String status;

            if(bmi<18.5) status="Underweight";
            else if(bmi<25) status="Normal";
            else if(bmi<30) status="Overweight";
            else status="Obese";

            res[i][0]=String.valueOf(data[i][1]);
            res[i][1]=String.valueOf(w);
            res[i][2]=String.valueOf(bmi);
            res[i][3]=status;
        }

        return res;
    }

    static void show(String[][] r){

        System.out.println("Height Weight BMI Status");

        for(int i=0;i<r.length;i++)
            System.out.println(r[i][0]+" "+r[i][1]+" "+r[i][2]+" "+r[i][3]);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        double[][] data=new double[10][2];

        for(int i=0;i<10;i++){
            data[i][0]=sc.nextDouble();
            data[i][1]=sc.nextDouble();
        }

        String[][] r=calc(data);

        show(r);
        sc.close();
    }
}