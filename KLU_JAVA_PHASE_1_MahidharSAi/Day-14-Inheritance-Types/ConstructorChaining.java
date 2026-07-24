/*
 * Program: ConstructorChaining
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates constructor chaining
 * KL University - Java Placement Training
 */

class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
    
    Parent(String msg) {
        System.out.println("Parent class parameterized: " + msg);
    }
}

class Child extends Parent {
    Child() {
        super("Hello");
        System.out.println("Child class constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        System.out.println("Creating Child object:");
        Child child = new Child();
    }
}
