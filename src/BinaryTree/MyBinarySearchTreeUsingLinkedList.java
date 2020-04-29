/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package BinaryTree;

import node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MyBinarySearchTreeUsingLinkedList {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }
    public void insert(int data){
        TreeNode node = new TreeNode(data);

        if(root == null){
            root = node;
        }
        else{
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null){
                parent = temp;
                if(node.getData() <= temp.getData()){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }
            if(node.getData() <= parent.getData()){
                parent.setLeft(node);
            }
            else {
                parent.setRight(node);
            }
        }
    }
    public boolean search(int data){
        boolean res = false;
        TreeNode temp = root;
        while (temp !=null){
            if(temp.getData() == data) {
                res = true;
                break;
            }
            if(data <= temp.getData()) {
                temp = temp.getLeft();
            }
            else{
                temp = temp.getRight();
            }

        }
        return res;
    }
    public void traversePreOrder(TreeNode node){
        if(node == null) {

        }
        else{
            System.out.print(node.getData() + ",");
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }
    public void traverseInOrder(TreeNode node){
        if(node == null) {

        }
        else{
            traverseInOrder(node.getLeft());
            System.out.print(node.getData() + ",");
            traverseInOrder(node.getRight());
        }

    }
    public void traversePostOrder(TreeNode node){
        if(node == null){

        }
        else{
            traversePostOrder(node.getLeft());
            traversePostOrder(node.getRight());
            System.out.print(node.getData() + ",");
        }
    }
    public void traverseLevelOrder(TreeNode node){
        if(node != null) {
            Queue<TreeNode> q = new LinkedList<>();
            q.add(node);
            while (!q.isEmpty()) {
                TreeNode current = q.remove();
                System.out.print(current.getData() + ",");
                if (current.getLeft() != null) {
                    q.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    q.add(current.getRight());
                }
            }
        }
        else{
            System.out.println("Tree is empty");
        }
    }
}
