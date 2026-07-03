/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Node {
    public int data;
    public Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};

class Solution {
    int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    int size(Node root){
        if(root==null) return 0;
        return 1 + size(root.left)+size(root.right);
    }
    boolean isPerfect(Node root) {
        // code here
        int level=level(root);
        int size=size(root);
        return Math.pow(2,level) -1 == size;
    }
};