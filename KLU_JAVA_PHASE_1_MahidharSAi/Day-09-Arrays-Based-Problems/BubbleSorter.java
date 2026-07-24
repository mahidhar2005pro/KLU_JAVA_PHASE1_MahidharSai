/*
 * Program: BubbleSorter
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Sorts array using bubble sort
 * KL University - Java Placement Training
 */

public class BubbleSorter {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        
        System.out.println("Original array:");
        printArray(arr);
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
    
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
