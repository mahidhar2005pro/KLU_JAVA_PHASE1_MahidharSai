/*
 * Program: MethodOverloadingDemo
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates method overloading
 * KL University - Java Placement Training
 */

public class MethodOverloadingDemo {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        System.out.println("Sum (int): " + add(5, 10));
        System.out.println("Sum (double): " + add(5.5, 10.5));
        System.out.println("Sum (3 ints): " + add(5, 10, 15));
    }
}
