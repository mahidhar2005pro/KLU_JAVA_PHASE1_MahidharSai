/*
 * Program: AbstractClassDemo
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates abstract class
 * KL University - Java Placement Training
 */

abstract class Shape {
    String color;
    
    Shape(String color) {
        this.color = color;
    }
    
    // Abstract methods
    abstract double area();
    abstract double perimeter();
    
    // Concrete method
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    
    @Override
    double area() {
        return length * width;
    }
    
    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rect = new Rectangle("Blue", 4, 6);
        
        System.out.println("Circle:");
        circle.displayColor();
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());
        
        System.out.println("\nRectangle:");
        rect.displayColor();
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());
    }
}
