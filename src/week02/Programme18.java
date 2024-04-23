package week02;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Programme18 {
    public void sum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void subtraction(int a, int b) {
        System.out.println(a + " - " + b + " = " + (a - b));
    }

    public void multiplication(int a, int b) {
        System.out.println(a + " x " + b + " = " + (a * b));
    }

    public void divide(int a, int b) {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    public void remainder(int a, int b) {
        System.out.println(a + " mod " + b + " = " + (a % b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        Programme18 obj = new Programme18();
        obj.sum(num1, num2);
        obj.subtraction(num1, num2);
        obj.multiplication(num1, num2);
        obj.divide(num1, num2);
        obj.remainder(num1, num2);
    }
}
