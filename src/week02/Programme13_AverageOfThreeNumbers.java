package week02;

import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Programme13_AverageOfThreeNumbers {
    public static void averageThreeNums(int a, int b, int c){
        System.out.println("Average of three numbers "+a+", "+b+" and "+c+" is "+(a+b+c)/3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        averageThreeNums(num1,num2,num3);

    }
}
