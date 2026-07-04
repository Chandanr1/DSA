/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Node {
    int data;
    Node left, right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
}


class Solution {
    public boolean isBalanced(Node root) {
        // code here
        if(root==null) return true;
        int left=level(root.left);
        int right=level(root.right);
        if(Math.abs(left-right)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    int level(Node root){
        if(root==null) return 0;
        return 1 + Math.max(level(root.left),level(root.right));
    }
}