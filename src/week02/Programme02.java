package week02;

import java.util.Scanner;
/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme02 {
    //2.1 Declare two static variables
    static int num;
    static String name;

    //2.2 Declare one static method
    public static void printMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number.");
        num=scanner.nextInt();
        System.out.println("Please enter any text.");
        name = scanner.next();
        //2.3 Call both static variables into the static method inside the print statement.
        System.out.println("First static variable: "+num);
        System.out.println("Second static variable: "+name);
    }

    //2.4 Declare the Main method.
    public static void main(String[] args) {
        //2.5 Call the static method into the Main method and Run the programme.
        printMethod();
    }
}
