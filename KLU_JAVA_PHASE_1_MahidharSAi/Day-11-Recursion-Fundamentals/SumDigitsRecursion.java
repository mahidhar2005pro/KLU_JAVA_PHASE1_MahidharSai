/*
 * Program: SumDigitsRecursion
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Calculates sum of digits using recursion
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class SumDigitsRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Sum of digits = " + sumDigits(n));
        scanner.close();
    }
    
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }
}
