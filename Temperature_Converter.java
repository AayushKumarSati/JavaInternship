import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("1.  tempersture celsius To fahrenheit ");
        System.out.println("2.  tempersture fahrenheit To celsius");

        System.out.print("Enter any option : ");
        int num = scn.nextInt();
        switch (num) {
            case 1:
                System.out.print(" Enter the tempersture celsius : ");
                double celsius = scn.nextDouble();
                double resultfahrenheit = celsiusToFahrenheit(celsius);
                System.out.println(celsius + " degree is equal to : " + resultfahrenheit + " degree fahrenheit");
                break;

            case 2:
                System.out.print(" Enter the tempersture fahrenheit : ");
                double fahrenheit = scn.nextDouble();
                double resultcelsius = fahrenheitToCelsius(fahrenheit);
                System.out.println(fahrenheit + " degree  equal to : " + resultcelsius + " degree celsius");
                break;

            default:
                System.out.println("Please Enter valid Inputs");
                break;

        }
        scn.close();

    }

    /* Methods Comverting celsius To Fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    /* Methods Comverting Fahrenheit To celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;

    }

}