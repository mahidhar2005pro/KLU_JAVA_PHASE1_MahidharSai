/*
 * Program: CircularLinkedList
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Implements circular linked list
 * KL University - Java Placement Training
 */

class CNode {
    int data;
    CNode next;
    
    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularList {
    CNode head;
    
    void insert(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        CNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    
    void display() {
        if (head == null) return;
        CNode temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.display();
    }
}
