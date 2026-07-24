/*
 * Program: StrongNumberTester
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Tests if a number is a strong number
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class StrongNumberTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number = number / 10;
        }
        
        if (sum == original) {
            System.out.println(original + " is a Strong number");
        } else {
            System.out.println(original + " is NOT a strong number");
        }
        keyboard.close();
    }
    
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
