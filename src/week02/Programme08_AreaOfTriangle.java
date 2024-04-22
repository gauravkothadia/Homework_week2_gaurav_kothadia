package week02;

import java.util.Scanner;

/**
 * 8. Write a program to calculate the area of a triangle.
 */
public class Programme08_AreaOfTriangle {
    public static void areaOfTriangle(double base, double altitude){
        double areaTriangle = base*altitude/2;
        System.out.println("Area of the triangle having base "+base+" and height "+altitude+" is "+areaTriangle);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base length of triangle.");
        double b = scanner.nextDouble();
        System.out.println("Enter the height of the triangle on its base.");
        double h = scanner.nextDouble();
        areaOfTriangle(b,h);
    }
}
