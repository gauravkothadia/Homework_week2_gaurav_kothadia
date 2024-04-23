package week02;

/**
 * 12. Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */
public class Programme12_ComputeExpression {
    public void computeExpression(double a, double b, double c, double d){
        System.out.println("Expected Output: "+((a*b-b*b)/(c-d)));
    }

    public static void main(String[] args) {
        Programme12_ComputeExpression comp = new Programme12_ComputeExpression();
        comp.computeExpression(25.5,3.5,40.5,4.5);
    }
}
