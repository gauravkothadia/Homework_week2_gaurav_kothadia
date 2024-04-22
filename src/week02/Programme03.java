package week02;
/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme03 {
    //3.1 Declare one instance and one static variable.
    String name1 = "I am instance variable.";
    static String name2 = "I am static variable";

    //3.2 Declare one instance method.
    public void instanceMethod(){
        System.out.println("Calling instance variable in instance method.");
        System.out.println(name1);
        System.out.println("Calling static variable in instance method.");
        System.out.println(name2);
    }
    //3.3 Declare one static method.
    public static void staticMethod(){
        System.out.println("Calling instance variable in static method.");
        Programme03 obj2 = new Programme03();
        System.out.println(obj2.name1);
        System.out.println("Calling static variable in static method.");
        System.out.println(name2);
    }
//3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    //3.5 Declare the Main method.
    public static void main(String[] args) {
        //3.6 Call both instance and static methods into the Main method and run the programme.
        Programme03 obj1 = new Programme03();
        //calling instance method
        obj1.instanceMethod();
        System.out.println("--------------------");
        //calling static method
        staticMethod();
    }


}
