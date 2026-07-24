/*
 * Program: HarshadNumberValidator
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Validates Harshad/Niven numbers
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class HarshadNumberValidator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = reader.nextInt();
        
        int temp = number;
        int digitSum = 0;
        while (temp != 0) {
            digitSum += (temp % 10);
            temp = temp / 10;
        }
        
        if (number % digitSum == 0) {
            System.out.println(number + " (sum=" + digitSum + ") is a Harshad number");
        } else {
            System.out.println(number + " is NOT a Harshad number");
        }
        reader.close();
    }
}
