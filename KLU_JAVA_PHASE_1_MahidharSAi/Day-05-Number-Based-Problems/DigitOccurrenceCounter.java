/*
 * Program: DigitOccurrenceCounter
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Counts occurrences of a specific digit
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class DigitOccurrenceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        System.out.print("Enter digit to count: ");
        int targetDigit = scanner.nextInt();
        
        int count = 0;
        while (number != 0) {
            int digit = (int)(number % 10);
            if (digit == targetDigit) {
                count++;
            }
            number = number / 10;
        }
        
        System.out.println("Digit '" + targetDigit + "' appears " + count + " times");
        scanner.close();
    }
}
