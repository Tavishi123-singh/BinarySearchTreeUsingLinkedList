/*
 * Created by Intellij IDEA
 * User: Tavishi123-singh
 */
package BinaryTree;

import node.TreeNode;

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
}
