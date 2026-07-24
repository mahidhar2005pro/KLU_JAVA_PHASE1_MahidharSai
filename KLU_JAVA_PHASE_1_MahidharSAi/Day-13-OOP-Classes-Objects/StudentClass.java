/*
 * Program: StudentClass
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Demonstrates class with attributes and methods
 * KL University - Java Placement Training
 */

public class StudentClass {
    int rollNo;
    String name;
    double marks;
    
    // Constructor
    StudentClass(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + getGrade());
    }
    
    String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
    
    public static void main(String[] args) {
        StudentClass s1 = new StudentClass(101, "Harsha", 95);
        StudentClass s2 = new StudentClass(102, "Sandeep", 78);
        
        System.out.println("Student 1 Details:");
        s1.display();
        System.out.println();
        System.out.println("Student 2 Details:");
        s2.display();
    }
}
