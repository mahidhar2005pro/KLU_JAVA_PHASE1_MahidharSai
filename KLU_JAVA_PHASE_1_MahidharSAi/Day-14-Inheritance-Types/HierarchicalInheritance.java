/*
 * Program: HierarchicalInheritance
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates hierarchical inheritance
 * KL University - Java Placement Training
 */

class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

class Lion extends Animal {
    void roar() {
        System.out.println("Lion roars");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Lion lion = new Lion();
        
        System.out.println("Dog:");
        dog.eat();
        dog.bark();
        
        System.out.println("\nCat:");
        cat.eat();
        cat.meow();
        
        System.out.println("\nLion:");
        lion.eat();
        lion.roar();
    }
}
