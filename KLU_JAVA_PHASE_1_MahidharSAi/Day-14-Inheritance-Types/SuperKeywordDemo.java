/*
 * Program: SuperKeywordDemo
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates super keyword usage
 * KL University - Java Placement Training
 */

class Animal {
    String type = "Animal";
    
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String type = "Dog";
    
    void sound() {
        System.out.println("Dog barks");
    }
    
    void display() {
        System.out.println("Using super:");
        System.out.println("Type: " + super.type);
        super.sound();
        
        System.out.println("Using this:");
        System.out.println("Type: " + this.type);
        this.sound();
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
