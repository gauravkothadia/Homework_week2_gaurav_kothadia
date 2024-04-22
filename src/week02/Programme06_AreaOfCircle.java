package week02;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Programme06_AreaOfCircle {
    public void areaOfCircle(double rad){
        final double PI = 3.14;
        double area = PI*rad*rad;
        System.out.println("Area of the circle with radius "+rad+" is "+area);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Programme06_AreaOfCircle obj = new Programme06_AreaOfCircle();
        obj.areaOfCircle(radius);
    }
}
