package week02;

import java.util.Scanner;

/**
 * 9. Write a program to convert the upper case to lower case.
 */
public class Programme09_CaseConversion {
    public void upperToLowerCase(String upper) {
        String lower = upper.toLowerCase();
        System.out.println("Upper case: " + upper + " is converted to lower case: " + lower);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter upper case:");
        String letter = scanner.next();
        Programme09_CaseConversion convert = new Programme09_CaseConversion();
        convert.upperToLowerCase(letter);
    }
}
