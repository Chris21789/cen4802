package Fibonacci_Sequence;

import java.util.Scanner;

public class Main {
    private static long fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return (fibonacci(n-1) + fibonacci(n-2));
    }

    public static void main (String arg[]) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a desired nth term for the Fibonacci series: ");

        n = input.nextInt();

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + fibonacci(n) + ".");
    }
}
