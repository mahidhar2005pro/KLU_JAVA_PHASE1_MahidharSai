/*
 * Program: PerfectNumberValidator
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Validates if a number is perfect
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class PerfectNumberValidator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        if (sum == number) {
            System.out.println(number + " is a Perfect number");
        } else {
            System.out.println(number + " is NOT a perfect number");
        }
        reader.close();
    }
}
