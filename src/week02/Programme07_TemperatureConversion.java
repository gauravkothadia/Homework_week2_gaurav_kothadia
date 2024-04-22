package week02;

import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme07_TemperatureConversion {
    public static void converToCelcius(double temp){
        double celciusTemp = ((temp-32)*5/9);
        System.out.println(temp+" degree F is equal to "+celciusTemp+" degree C.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature value in degree F.");
        double fahrenheitTemp = scanner.nextDouble();
        converToCelcius(fahrenheitTemp);
    }
}
