/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};

class Solution {
    public boolean isFullTree(Node root) {
        // code here
        if(root==null) return false;
        if(root.left==null && root.right==null) return true;
        return isFullTree(root.left) && isFullTree(root.right);
    }
}