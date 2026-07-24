/*
 * Program: TailRecursion
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates tail recursion
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class TailRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Tail Recursion Output:");
        tailRecursion(n);
        scanner.close();
    }
    
    public static void tailRecursion(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            tailRecursion(n - 1);  // Recursive call at end
        }
    }
}
