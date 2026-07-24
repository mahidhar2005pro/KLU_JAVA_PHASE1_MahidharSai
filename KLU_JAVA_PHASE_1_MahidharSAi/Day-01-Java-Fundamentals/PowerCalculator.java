/*
 * Program: PowerCalculator
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Calculates power of a number
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        
        int result = 1;
        int tempExp = exponent;
        while (tempExp != 0) {
            result *= base;
            tempExp--;
        }
        
        System.out.println(base + " ^ " + exponent + " = " + result);
        scanner.close();
    }
}
