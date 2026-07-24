/*
 * Program: AmicablePairFinder
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Finds if two numbers are amicable pairs
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class AmicablePairFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        int sum1 = 0, sum2 = 0;
        for (int i = 1; i <= num1 / 2; i++) {
            if (num1 % i == 0) sum1 += i;
        }
        for (int i = 1; i <= num2 / 2; i++) {
            if (num2 % i == 0) sum2 += i;
        }
        
        if (sum1 == num2 && sum2 == num1) {
            System.out.println(num1 + " and " + num2 + " are Amicable numbers");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT amicable");
        }
        input.close();
    }
}
