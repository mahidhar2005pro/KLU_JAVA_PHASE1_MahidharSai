/*
 * Program: AccessModifiersDemo
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates access modifiers
 * KL University - Java Placement Training
 */

class AccessExample {
    public int publicVar = 10;
    private int privateVar = 20;
    protected int protectedVar = 30;
    int defaultVar = 40;
    
    public void display() {
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        System.out.println("Accessing from same class:");
        obj.display();
        
        System.out.println("\nAccessing directly:");
        System.out.println("Public: " + obj.publicVar);
        // System.out.println("Private: " + obj.privateVar); // Not accessible
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);
    }
}
