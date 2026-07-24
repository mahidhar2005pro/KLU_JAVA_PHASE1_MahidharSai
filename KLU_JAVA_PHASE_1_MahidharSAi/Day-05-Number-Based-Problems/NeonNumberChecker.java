/*
 * Program: NeonNumberChecker
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Checks if a number is a neon number
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class NeonNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += (square % 10);
            square = square / 10;
        }
        
        if (sum == number) {
            System.out.println(number + " is a Neon number");
        } else {
            System.out.println(number + " is NOT a Neon number");
        }
        scanner.close();
    }
}
