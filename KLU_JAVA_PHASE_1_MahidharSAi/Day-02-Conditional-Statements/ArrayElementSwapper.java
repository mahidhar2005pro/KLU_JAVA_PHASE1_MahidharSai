/*
 * Program: ArrayElementSwapper
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Swaps two elements in an array
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class ArrayElementSwapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter first index: ");
        int idx1 = scanner.nextInt();
        System.out.print("Enter second index: ");
        int idx2 = scanner.nextInt();
        
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
        
        System.out.println("Array after swapping:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
