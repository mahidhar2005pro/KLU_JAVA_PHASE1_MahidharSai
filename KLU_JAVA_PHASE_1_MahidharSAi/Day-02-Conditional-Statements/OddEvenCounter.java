/*
 * Program: OddEvenCounter
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Counts odd and even numbers in an array
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int oddCount = 0, evenCount = 0;
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }
        
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Even numbers: " + evenCount);
        scanner.close();
    }
}
