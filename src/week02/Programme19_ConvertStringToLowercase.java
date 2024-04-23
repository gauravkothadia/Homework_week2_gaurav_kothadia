package week02;

import java.util.Scanner;

/**
 * 19. Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme19_ConvertStringToLowercase {
    public void stringToLowercase(String abc) {
        System.out.println("Output: " + abc.toLowerCase());
    }

    public static void main(String[] args) {

        System.out.print("Sample Input: ");
        String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        Programme19_ConvertStringToLowercase lc = new Programme19_ConvertStringToLowercase();
        System.out.println(str);
        lc.stringToLowercase(str);
    }
}
