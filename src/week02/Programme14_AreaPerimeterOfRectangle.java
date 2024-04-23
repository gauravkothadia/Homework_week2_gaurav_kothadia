package week02;

import java.text.DecimalFormat;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme14_AreaPerimeterOfRectangle {
    public void areaRectangle(double width, double height){
        System.out.println("Area is "+width+" * "+height+" = "+(width*height));
    }
    public void perimeterRectangle(double width, double height){
        System.out.println("Perimeter is 2 * ("+width+" + "+height+") = "+(2*(width+height)));
    }

    public static void main(String[] args) {
        Programme14_AreaPerimeterOfRectangle rec = new Programme14_AreaPerimeterOfRectangle();
        rec.areaRectangle(5.6,8.5);
        rec.perimeterRectangle(5.6,8.5);
    }
}
