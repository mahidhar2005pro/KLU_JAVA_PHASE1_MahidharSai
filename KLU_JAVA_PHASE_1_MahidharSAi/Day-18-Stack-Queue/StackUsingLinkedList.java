/*
 * Program: StackUsingLinkedList
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Implements stack using linked list
 * KL University - Java Placement Training
 */

class StackNode {
    int data;
    StackNode next;
    
    StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLL {
    StackNode top;
    
    void push(int data) {
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }
    
    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int data = top.data;
        top = top.next;
        return data;
    }
    
    int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }
    
    void display() {
        StackNode temp = top;
        System.out.print("Stack (top to bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.display();
        
        System.out.println("Popped: " + stack.pop());
        stack.display();
    }
}
