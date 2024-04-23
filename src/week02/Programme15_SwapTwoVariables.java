package week02;

import java.util.Scanner;

/**
 * 15. Write a Java program to swap two variables.
 */
public class Programme15_SwapTwoVariables {
    public void swapping(int a, int b){
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping: a="+a+" ; b="+b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a=");
        int num1 = scanner.nextInt();
        System.out.print("Enter number b=");
        int num2 = scanner.nextInt();
        System.out.println("Before swapping: a="+num1+" ; b="+num2);
        Programme15_SwapTwoVariables swap = new Programme15_SwapTwoVariables();
        swap.swapping(num1, num2);
    }
}
