/*
 * Program: ArmstrongChecker
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Verifies if a number is an Armstrong number
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class ArmstrongChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            temp = temp / 10;
            digitCount++;
        }
        
        temp = number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp = temp / 10;
        }
        
        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is NOT an Armstrong number");
        }
        input.close();
    }
}
