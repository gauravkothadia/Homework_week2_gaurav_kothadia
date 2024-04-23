package week02;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Programme17_ConvertDecimalToBinaryNum {
    public static void convertDecimalToBinary(int a){
        String ans = Integer.toString(a,2);
        System.out.println("Binary number of "+a+" is "+ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any number: ");
        int num = scanner.nextInt();
        convertDecimalToBinary(num);
    }
}
