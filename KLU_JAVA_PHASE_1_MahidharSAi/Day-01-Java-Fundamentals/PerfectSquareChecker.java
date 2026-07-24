/*
 * Program: PerfectSquareChecker
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Checks if a number is a perfect square
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPerfectSquare = false;
        for (int i = 1; i <= number / 2; i++) {
            if (i * i == number) {
                isPerfectSquare = true;
                break;
            }
        }
        
        if (isPerfectSquare) {
            System.out.println(number + " is a Perfect square");
        } else {
            System.out.println(number + " is NOT a perfect square");
        }
        scanner.close();
    }
}
