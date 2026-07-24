/*
 * Program: AverageOfMultiples
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Calculates average of multiples of 6
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class AverageOfMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0, count = 0;
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] % 6 == 0) {
                sum += arr[i];
                count++;
            }
        }
        
        float avg = (float) sum / count;
        System.out.printf("Average of multiples of 6: %.3f\n", avg);
        scanner.close();
    }
}
