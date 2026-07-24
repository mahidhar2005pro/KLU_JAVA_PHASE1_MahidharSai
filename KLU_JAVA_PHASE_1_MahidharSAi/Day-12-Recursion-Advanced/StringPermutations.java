/*
 * Program: StringPermutations
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Generates all permutations of a string
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("All permutations:");
        generatePermutations(str, "");
        scanner.close();
    }
    
    public static void generatePermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String remaining = str.substring(0, i) + str.substring(i + 1);
            generatePermutations(remaining, prefix + str.charAt(i));
        }
    }
}
