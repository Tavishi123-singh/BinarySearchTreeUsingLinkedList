/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package main;

import BinaryTree.MyBinarySearchTreeUsingLinkedList;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTreeUsingLinkedList bst = new MyBinarySearchTreeUsingLinkedList();
        bst.insert(50);
        bst.insert(25);
        bst.insert(75);
        bst.insert(10);
        bst.insert(35);
        bst.insert(40);
        System.out.println("Height of tree");
        System.out.println(bst.height(bst.getRoot()));
        System.out.println("Height of tree");
        System.out.println(bst.heightNonRecursive(bst.getRoot()));
        System.out.println("InOrder Traversal");
        bst.traverseInOrder(bst.getRoot());
        System.out.println();
        System.out.println("PreOrder Traversal");
        bst.traversePreOrder(bst.getRoot());
        System.out.println();
        System.out.println("PostOrder Traversal");
        bst.traversePostOrder(bst.getRoot());
        System.out.println();
        boolean result=bst.search(40);
        if(result==true) System.out.println("element found");
        else System.out.println("element not found");

    }
}
