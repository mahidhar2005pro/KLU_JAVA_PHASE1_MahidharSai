/*
 * Program: BinarySearchTree
 * Author: Harsha Allam
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Implements binary search tree operations
 * KL University - Java Placement Training
 */

class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;
    
    BSTNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    BSTNode root;
    
    void insert(int data) {
        root = insertRec(root, data);
    }
    
    BSTNode insertRec(BSTNode root, int data) {
        if (root == null) {
            return new BSTNode(data);
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    
    boolean search(int data) {
        return searchRec(root, data);
    }
    
    boolean searchRec(BSTNode root, int data) {
        if (root == null) return false;
        if (root.data == data) return true;
        return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data);
    }
    
    void inorder() {
        inorderRec(root);
        System.out.println();
    }
    
    void inorderRec(BSTNode root) {
        if (root == null) return;
        inorderRec(root.left);
        System.out.print(root.data + " ");
        inorderRec(root.right);
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        
        System.out.print("Inorder: ");
        bst.inorder();
        
        System.out.println("Search 40: " + bst.search(40));
        System.out.println("Search 100: " + bst.search(100));
    }
}
