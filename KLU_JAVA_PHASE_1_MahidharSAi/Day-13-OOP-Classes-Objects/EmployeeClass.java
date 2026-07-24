/*
 * Program: EmployeeClass
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates class with getters and setters
 * KL University - Java Placement Training
 */

public class EmployeeClass {
    private int empId;
    private String empName;
    private double salary;
    
    // Constructor
    EmployeeClass(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
    
    // Getters and Setters
    public int getEmpId() { return empId; }
    public String getEmpName() { return empName; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: $" + salary);
    }
    
    public static void main(String[] args) {
        EmployeeClass e1 = new EmployeeClass(1001, "John", 50000);
        EmployeeClass e2 = new EmployeeClass(1002, "Jane", 60000);
        
        System.out.println("Employee 1:");
        e1.display();
        System.out.println();
        System.out.println("Employee 2:");
        e2.display();
        
        e1.setSalary(55000);
        System.out.println("\nAfter salary update:");
        e1.display();
    }
}
