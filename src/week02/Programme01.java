package week02;

import java.util.Scanner;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Programme01 {
    // Declare two instance variables
    int a;
    String name;

    //Declare one instance method
    public void printMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number.");
        a=scanner.nextInt();
        System.out.println("Please enter any text.");
        name = scanner.next();
        //Call both instance variables into the instance method inside the print statement
        System.out.println("Calling instance variable 1 from instance method: "+a);
        System.out.println("Calling instance variable 2 from instance method: "+name);
    }

    //Declare the Main method
    public static void main(String[] args) {
        Programme01 obj = new Programme01();
        //Call the above instance method into the Main method and Run the programme
        obj.printMethod();
    }
}
