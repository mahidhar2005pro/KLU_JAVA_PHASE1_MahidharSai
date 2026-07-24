/*
 * Program: ArrayReplacer
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Replaces an element at given index
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class ArrayReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter index to replace: ");
        int index = scanner.nextInt();
        System.out.print("Enter new value: ");
        int value = scanner.nextInt();
        
        arr[index] = value;
        
        System.out.println("Array after replacement:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
