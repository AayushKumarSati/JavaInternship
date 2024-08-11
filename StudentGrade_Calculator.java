import java.util.Scanner;

public class StudentGrade_Calculator {
    public static void main(String[] args) {
        double total = 0, average;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Number Of Subject : ");
        int numofsub = scn.nextInt();
        double[] marks = new double[20];
        /* this is the input loops for subject marks */
        for (int i = 0; i < numofsub; i++) {
            marks[i] = scn.nextInt();
            /* to total the our marks */
            total += marks[i];

        }
        System.out.println("The Total Number Is : " + total);
        average = total / numofsub;
        char lettergrade = CalculatorGrade(average);
        System.out.printf("The Average Grade Is : %.2f\n", average);
        System.out.println("The Letter Grade Is : " + lettergrade);
        scn.close();
    }

    public static char CalculatorGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
