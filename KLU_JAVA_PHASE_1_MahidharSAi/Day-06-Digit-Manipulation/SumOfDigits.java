/*
 * Program: SumOfDigits
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Calculates sum of digits of a number
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += (temp % 10);
            temp = temp / 10;
        }
        
        System.out.println("Sum of digits of " + number + " = " + sum);
        scanner.close();
    }
}
