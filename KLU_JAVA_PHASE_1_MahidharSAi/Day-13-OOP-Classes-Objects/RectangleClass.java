/*
 * Program: RectangleClass
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates class with methods
 * KL University - Java Placement Training
 */

import java.util.Scanner;

class Rectangle {
    double length;
    double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    double calculateArea() {
        return length * width;
    }
    
    double calculatePerimeter() {
        return 2 * (length + width);
    }
    
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class RectangleClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = scanner.nextDouble();
        System.out.print("Enter width: ");
        double w = scanner.nextDouble();
        
        Rectangle rect = new Rectangle(l, w);
        System.out.println("\nRectangle Details:");
        rect.display();
        scanner.close();
    }
}
