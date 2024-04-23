package week02;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Programme16_AddTwoBinaryNumbers {
    public static void addBinaryNum(String a, String b){

        int number0 = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);
        int sum = number0 + number1;
        System.out.println("Sum of two binary numbers: "+Integer.toBinaryString(sum));
        //return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        String num1 = Integer.toString(scanner.nextByte());
        System.out.print("Enter second binary number: ");
        String num2 = Integer.toString(scanner.nextByte());
        addBinaryNum(num1,num2);
    }
}
