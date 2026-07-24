/*
 * Program: FibonacciRecursion
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Calculates Fibonacci using recursion
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter position: ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci at position " + n + " = " + fibonacci(n));
        scanner.close();
    }
    
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
