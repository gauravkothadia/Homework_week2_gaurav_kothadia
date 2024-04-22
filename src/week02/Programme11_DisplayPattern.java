package week02;

import java.util.Scanner;

/**
 * 11. Write a Java program to display the following pattern.
 * Sample Pattern :
 * J a v v a
 * J a a v v a a
 * J J aaaaa V V aaaaa
 * J J a a V a a
 */
public class Programme11_DisplayPattern {
    public static void displayPattern(String a, String b, String c) {

        System.out.println(a.toUpperCase() + "  " + b.toLowerCase() + " " + c.toLowerCase() + "  " + c.toLowerCase() + " " + b.toLowerCase());
        System.out.println(a.toUpperCase() + " " + b.toLowerCase() + " " + b.toLowerCase() + " " + c.toLowerCase() + " " + c.toLowerCase() + " " + b.toLowerCase() + " " + b.toLowerCase());
        System.out.println(a.toUpperCase() + " " + a.toUpperCase() + " " + b.toLowerCase() + b.toLowerCase() + b.toLowerCase() + b.toLowerCase() + b.toLowerCase() + " " + c.toUpperCase() + " " + c.toUpperCase() + " " + b.toLowerCase() + b.toLowerCase() + b.toLowerCase() + b.toLowerCase() + b.toLowerCase());
        System.out.println(a.toUpperCase() + " " + a.toUpperCase() + " " + b.toLowerCase() + "  " + b.toLowerCase() + " " + c.toUpperCase() + " " + b.toLowerCase() + "   " + b.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        displayPattern("j", "a", "v");
    }
}
