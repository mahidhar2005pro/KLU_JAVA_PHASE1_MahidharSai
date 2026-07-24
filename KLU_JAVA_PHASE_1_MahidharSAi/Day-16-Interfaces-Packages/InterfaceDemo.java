/*
 * Program: InterfaceDemo
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates interface implementation
 * KL University - Java Placement Training
 */

interface Drawable {
    void draw();
}

interface Colorable {
    void setColor(String color);
}

class Circle implements Drawable, Colorable {
    String color;
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
    
    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("Circle color set to: " + color);
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.setColor("Red");
        
        Rectangle rect = new Rectangle();
        rect.draw();
    }
}
