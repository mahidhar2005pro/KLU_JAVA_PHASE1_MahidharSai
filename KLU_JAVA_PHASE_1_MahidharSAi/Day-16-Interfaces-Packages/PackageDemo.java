/*
 * Program: PackageDemo
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates package creation and usage
 * KL University - Java Placement Training
 */

// File: PackageDemo.java
import mypackages.Calculator;

public class PackageDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.add(10, 20));
        System.out.println("Product: " + calc.multiply(5, 6));
    }
}

// Create a package: mypackages/Calculator.java
/*
package mypackages;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
}
*/
