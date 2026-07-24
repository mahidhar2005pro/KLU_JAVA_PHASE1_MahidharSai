/*
 * Program: HeadRecursion
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates head recursion
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class HeadRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Head Recursion Output:");
        headRecursion(n);
        scanner.close();
    }
    
    public static void headRecursion(int n) {
        if (n > 0) {
            headRecursion(n - 1);  // Recursive call first
            System.out.print(n + " ");
        }
    }
}
