package Fibonacci_Sequence;

import java.util.Scanner;

/**
 * This method's purpose is to input a desired nth element that will be used in fibonacci recursive method to
 * output a value that corresponds to the fibonacci series of that nth element.
 * @author Chris
 */
public class Main {
    /**
     * This method creates the main recursive fibonacci series equation that takes the n param as the main arg
     * to determine which value of the fibonacci series will be returned.
     * @param n User based input that determines which value of the fibonacci series will be returned and printed.
     * @return Returns an int value that corresponds to the fibonacci series.
     */
    private static long fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }

    /**
     * This method creates an int object to be used as the arg for the fibonacci method, creates a scanner that
     * will be used as the user input for this int n using the nextInt command and prints the message that includes
     * the nth element as well as runs the fibonacci method passing this element and returns the appropriate value
     * in the series.
     * @param arg
     */
    public static void main (String arg[]) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a desired nth element for the Fibonacci series: ");

        n = input.nextInt();

        System.out.println("The " + n + "th element of the Fibonacci sequence is " + fibonacci(n) + ".");
    }
}
