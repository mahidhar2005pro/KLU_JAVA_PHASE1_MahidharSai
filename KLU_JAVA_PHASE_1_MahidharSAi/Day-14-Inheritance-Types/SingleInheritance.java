/*
 * Program: SingleInheritance
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates single inheritance
 * KL University - Java Placement Training
 */

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
    
    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking: Beep Beep!");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.honk();
        myCar.stop();
    }
}
