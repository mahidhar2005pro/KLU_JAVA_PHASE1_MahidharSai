/*
 * Program: PrimeRangeFinder
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Finds prime numbers in a range
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class PrimeRangeFinder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = keyboard.nextInt();
        System.out.print("Enter end: ");
        int end = keyboard.nextInt();
        
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) {
                System.out.print(num + " ");
            }
        }
        keyboard.close();
    }
}
