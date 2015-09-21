/**
 * Compute the sum, difference, and product of two integers.
 * Created by cobalt on 9/21/15.
 */
public class ElementaryArithmetic {
    public static void main(String [] args){
        int firstNumber = 12;
        int secondNumber = 10;

        // Echo the variables
        System.out.println("First Number: " + firstNumber);
        System.out.println("Second Number: " + secondNumber);

        // Perform basic arithmetic
        System.out.println("Sum: " + (firstNumber + secondNumber));
        System.out.println("Difference: " + (firstNumber - secondNumber));
        System.out.println("Product: " + (firstNumber * secondNumber));
        System.out.println("Quotient: " + (firstNumber / secondNumber));
        System.out.println("Note: int / int = int ");
    }
}
