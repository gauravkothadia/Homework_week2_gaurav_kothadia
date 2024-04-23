package week02;

/**
 * 20. Write a Java Program to print as below.
 * "+------------------------+"
 * "|                        |"
 * "|     CORNER STORE       |"
 * "|                        |"
 * "|   2015-03-29 04:38PM   |"
 * "|                        |"
 * "|    Gallons: 10.870     |"
 * "| Price/gallon: $ 2.089  |"
 * "|                        |"
 * "|  Fuel total: $ 22.71   |"
 * "|                        |"
 * "+------------------------+"
 */
public class Programme20_GasReceipt {
    public static void main(String[] args) {
        printGasReceipt("CORNER STORE", "2015-03-29 04:38PM", 10.870, 2.089);
    }

    public static void printGasReceipt(String storeName, String dateTime, double gallons, double pricePerGallon) {
        String separatorLine = "+------------------------+";
        String blankLine = "|                        |";
        String gallonsLine = String.format("|  Gallons: %.3f       |", gallons);
        String pricePerGallonLine = String.format("|  Price/gallon: $ %.3f |", pricePerGallon);
        double fuelTotal = gallons * pricePerGallon;
        String fuelTotalLine = String.format("|  Fuel total: $ %.2f   |", fuelTotal);

        System.out.println(separatorLine);
        System.out.println(blankLine);
        System.out.println("|      " + storeName + "      |");
        System.out.println(blankLine);
        System.out.println("|  " + dateTime + "    |");
        System.out.println(blankLine);
        System.out.println(gallonsLine);
        System.out.println(pricePerGallonLine);
        System.out.println(blankLine);
        System.out.println(fuelTotalLine);
        System.out.println(blankLine);
        System.out.println(separatorLine);
    }
}