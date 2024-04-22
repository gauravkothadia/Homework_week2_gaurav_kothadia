package week02;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Programme05_Calculator {
    //code for addition
    public static void addition(int a, int b){
        System.out.println("Addition :  "+a+" + "+b+" is "+(a+b));
    }

    //code for subtraction
    public static void subtraction(int a, int b){
        System.out.println("Subtraction : "+a+" - "+b+" is "+(a-b));
    }
    //code for multiplication
    public void multiplication(int a, int b){
        System.out.println("Multiplication : "+a+" x "+b+" is "+(a*b));
    }

    //code for division
    public void division(int a, int b){
        System.out.println("Division : "+a+" / "+b+" is "+(a/b));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();
        addition(num1,num2);
        subtraction(num1,num2);
        Programme05_Calculator cal = new Programme05_Calculator();
        cal.multiplication(num1, num2);
        cal.division(num1,num2);
    }
}
