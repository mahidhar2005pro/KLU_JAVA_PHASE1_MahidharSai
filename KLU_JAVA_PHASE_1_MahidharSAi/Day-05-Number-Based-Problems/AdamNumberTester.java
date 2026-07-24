/*
 * Program: AdamNumberTester
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Checks if a number is an Adam number
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class AdamNumberTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int square = number * number;
        int reversed = reverseNumber(number);
        int reversedSquare = reversed * reversed;
        int reverseOfReversedSquare = reverseNumber(reversedSquare);
        
        if (reverseOfReversedSquare == square) {
            System.out.println(number + " is an Adam Number");
        } else {
            System.out.println(number + " is NOT an Adam Number");
        }
        scanner.close();
    }
    
    public static int reverseNumber(int num) {
        int result = 0;
        while (num != 0) {
            int digit = num % 10;
            result = (result * 10) + digit;
            num = num / 10;
        }
        return result;
    }
}
