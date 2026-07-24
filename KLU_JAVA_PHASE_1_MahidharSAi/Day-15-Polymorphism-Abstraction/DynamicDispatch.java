/*
 * Program: DynamicDispatch
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates dynamic method dispatch
 * KL University - Java Placement Training
 */

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Animal ref;
        
        ref = new Dog();
        ref.sound();
        
        ref = new Cat();
        ref.sound();
    }
}
