/*
* Created by Intellij IDEA
* User: Tavishi123-singh
 */
package node;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;
    private int height;

    public TreeNode(int data) {
        this.data = data;
        left=null;
        right=null;
        height=0;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getLeft() {
        return left;
    }
}
