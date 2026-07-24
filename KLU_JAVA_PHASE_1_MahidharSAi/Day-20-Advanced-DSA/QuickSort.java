/*
 * Program: QuickSort
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Implements quick sort algorithm
 * KL University - Java Placement Training
 */

public class QuickSort {
    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        QuickSort qs = new QuickSort();
        
        System.out.print("Original: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
        
        qs.sort(arr, 0, arr.length - 1);
        
        System.out.print("Sorted: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
}
