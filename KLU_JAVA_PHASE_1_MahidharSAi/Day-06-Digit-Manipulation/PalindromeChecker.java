/*
 * Program: PalindromeChecker
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Checks if a number is palindrome
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversed = 0;
        int temp = number;
        while (temp != 0) {
            reversed = (reversed * 10) + (temp % 10);
            temp = temp / 10;
        }
        
        if (number == reversed) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is NOT a palindrome");
        }
        scanner.close();
    }
}
