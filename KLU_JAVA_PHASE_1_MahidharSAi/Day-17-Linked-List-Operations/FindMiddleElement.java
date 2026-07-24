/*
 * Program: FindMiddleElement
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Finds middle element of linked list
 * KL University - Java Placement Training
 */

class MiddleNode {
    int data;
    MiddleNode next;
    
    MiddleNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListMiddle {
    MiddleNode head;
    
    void insert(int data) {
        MiddleNode newNode = new MiddleNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        MiddleNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    
    int findMiddle() {
        if (head == null) return -1;
        MiddleNode slow = head;
        MiddleNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    
    void display() {
        MiddleNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class FindMiddleElement {
    public static void main(String[] args) {
        LinkedListMiddle list = new LinkedListMiddle();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        
        list.display();
        System.out.println("Middle element: " + list.findMiddle());
    }
}
