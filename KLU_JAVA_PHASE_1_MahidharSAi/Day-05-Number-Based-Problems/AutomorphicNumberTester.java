/*
 * Program: AutomorphicNumberTester
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Tests if a number is automorphic
 * KL University - Java Placement Training
 */

import java.util.Scanner;

public class AutomorphicNumberTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int temp = number;
        int count = 0;
        int square = number * number;
        
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        
        int divisor = (int) Math.pow(10, count);
        if (square % divisor == number) {
            System.out.println(number + " is an Automorphic number");
        } else {
            System.out.println(number + " is NOT an Automorphic number");
        }
        input.close();
    }
}
