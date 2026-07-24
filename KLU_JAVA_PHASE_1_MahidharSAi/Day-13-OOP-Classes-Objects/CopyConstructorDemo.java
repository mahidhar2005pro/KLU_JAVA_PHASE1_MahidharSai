/*
 * Program: CopyConstructorDemo
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates copy constructor
 * KL University - Java Placement Training
 */

public class CopyConstructorDemo {
    int id;
    String name;
    
    // Normal constructor
    CopyConstructorDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Copy constructor
    CopyConstructorDemo(CopyConstructorDemo obj) {
        this.id = obj.id;
        this.name = obj.name;
    }
    
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    
    public static void main(String[] args) {
        CopyConstructorDemo original = new CopyConstructorDemo(10, "Original");
        CopyConstructorDemo copy = new CopyConstructorDemo(original);
        
        System.out.println("Original Object:");
        original.display();
        System.out.println("Copied Object:");
        copy.display();
    }
}
