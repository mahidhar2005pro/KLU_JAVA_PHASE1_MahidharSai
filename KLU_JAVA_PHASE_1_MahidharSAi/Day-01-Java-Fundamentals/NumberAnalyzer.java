/*
 * Program: NumberAnalyzer
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Counts prime digits in a number
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int primeDigitCount = 0;
        int temp = number;
        
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 1 || digit == 2 || digit == 3 || 
                digit == 5 || digit == 7 || digit == 9) {
                primeDigitCount++;
            }
            temp = temp / 10;
        }
        
        System.out.println("Prime digits count: " + primeDigitCount);
        input.close();
    }
}
