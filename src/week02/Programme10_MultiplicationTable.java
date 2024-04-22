package week02;

import java.util.Scanner;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class Programme10_MultiplicationTable {
    public void multiplicationTable(int a) {
        System.out.println("Expected Output:");
        System.out.println(a + " x 1 = " + (a * 1));
        System.out.println(a + " x 2 = " + (a * 2));
        System.out.println(a + " x 3 = " + (a * 3));
        System.out.println(a + " x 4 = " + (a * 4));
        System.out.println(a + " x 5 = " + (a * 5));
        System.out.println(a + " x 6 = " + (a * 6));
        System.out.println(a + " x 7 = " + (a * 7));
        System.out.println(a + " x 8 = " + (a * 8));
        System.out.println(a + " x 9 = " + (a * 9));
        System.out.println(a + " x 10 = " + (a * 10));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Test Data: Input a number: ");
        int input = scanner.nextInt();
        Programme10_MultiplicationTable table = new Programme10_MultiplicationTable();
        table.multiplicationTable(input);
    }
}
