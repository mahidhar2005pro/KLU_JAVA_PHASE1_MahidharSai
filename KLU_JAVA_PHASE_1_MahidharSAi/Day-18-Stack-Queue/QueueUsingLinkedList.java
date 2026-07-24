/*
 * Program: QueueUsingLinkedList
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Implements queue using linked list
 * KL University - Java Placement Training
 */

class QNode {
    int data;
    QNode next;
    
    QNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueLL {
    QNode front;
    QNode rear;
    
    void enqueue(int data) {
        QNode newNode = new QNode(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued: " + data);
    }
    
    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }
    
    void display() {
        QNode temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        QueueLL queue = new QueueLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
    }
}
