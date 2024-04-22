package week02;

import java.util.Scanner;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme04 {
    //4.1 Declare two instance and two static variables.
    int inst1;
    String inst2;
    static int stat1;
    static String stat2;

    //4.2 Declare one instance method.
    public void instantMethod() {
        System.out.println("Instant method printout.");
        System.out.println(inst1);
        System.out.println(inst2);
        System.out.println(stat1);
        System.out.println(stat2);
    }

    //4.3 Declare one static method.
    public static void staticMethod(int a, String b, int c, String d) {
        System.out.println("Static method printout.");
        Programme04 st = new Programme04();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    //4.4 Call all four instance and static variables into both instance and static methods inside the
    //print statement.

    //4.5 Declare the Main method.
    public static void main(String[] args) {

        Programme04 mainObj = new Programme04();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        mainObj.inst1 = scanner.nextInt();
        System.out.println("Enter a string: ");
        mainObj.inst2 = scanner.next();
        System.out.println("Enter a second number: ");
        stat1 = scanner.nextInt();
        System.out.println("Enter a second text: ");
        stat2 = scanner.next();

        //4.6 Call both instance and static methods into the Main method and run the programme.
        mainObj.instantMethod();
        System.out.println("-----------------");
        staticMethod(mainObj.inst1, mainObj.inst2, stat1, stat2);
    }
}
