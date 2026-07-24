/*
 * Program: StepCounter
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Counts steps to reduce number to zero
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class StepCounter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = keyboard.nextInt();
        
        int steps = 0;
        while (number != 0) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number - 1;
            }
            steps++;
        }
        
        System.out.println("Steps to reduce to zero: " + steps);
        keyboard.close();
    }
}
