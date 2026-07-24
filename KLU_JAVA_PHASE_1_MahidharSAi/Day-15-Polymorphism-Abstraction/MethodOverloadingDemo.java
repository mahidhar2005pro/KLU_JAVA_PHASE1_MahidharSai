/*
 * Program: MethodOverloadingDemo
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates method overloading
 * KL University - Java Placement Training
 */

public class MethodOverloadingDemo {
    
    // Overloaded methods
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        
        System.out.println("Add (2 ints): " + obj.add(5, 10));
        System.out.println("Add (3 ints): " + obj.add(5, 10, 15));
        System.out.println("Add (2 doubles): " + obj.add(5.5, 10.5));
        System.out.println("Add (2 strings): " + obj.add("Hello ", "World"));
    }
}
