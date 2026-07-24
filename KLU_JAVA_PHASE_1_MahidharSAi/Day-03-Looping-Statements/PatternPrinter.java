/*
 * Program: PatternPrinter
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Prints star patterns using loops
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.println("\nPattern 1 - Triangle:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\nPattern 2 - Inverted Triangle:");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
