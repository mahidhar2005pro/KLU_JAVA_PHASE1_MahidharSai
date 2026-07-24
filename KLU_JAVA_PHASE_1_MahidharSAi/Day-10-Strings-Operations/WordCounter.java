/*
 * Program: WordCounter
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Counts words in a string
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word count: " + words.length);
        scanner.close();
    }
}
