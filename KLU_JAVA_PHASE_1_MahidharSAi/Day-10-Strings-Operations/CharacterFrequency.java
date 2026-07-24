/*
 * Program: CharacterFrequency
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Counts character frequencies in a string
 * KL University - Java Placement Training
 */

public class CharacterFrequency {
    public static void main(String[] args) {
        String text = "programming";
        int[] frequency = new int[256];
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }
        
        System.out.println("Character frequencies in '" + text + "':");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + " → " + frequency[i]);
            }
        }
    }
}
