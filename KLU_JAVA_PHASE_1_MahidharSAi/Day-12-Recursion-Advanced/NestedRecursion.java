/*
 * Program: NestedRecursion
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates nested recursion
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class NestedRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Nested Recursion Result: " + nestedRecursion(n));
        scanner.close();
    }
    
    public static int nestedRecursion(int n) {
        if (n > 100) return n - 10;
        return nestedRecursion(nestedRecursion(n + 11));
    }
}
