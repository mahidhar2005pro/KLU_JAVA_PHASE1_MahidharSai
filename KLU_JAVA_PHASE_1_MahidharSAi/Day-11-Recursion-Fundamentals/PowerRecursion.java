/*
 * Program: PowerRecursion
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Calculates power using recursion
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class PowerRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exp = scanner.nextInt();
        System.out.println(base + "^" + exp + " = " + power(base, exp));
        scanner.close();
    }
    
    public static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }
}
