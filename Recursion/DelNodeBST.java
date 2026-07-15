/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    public Node delNode(Node root, int x) {
        // code here
        if(root==null) return null;
        if(root.data>x) {
            root.left=delNode(root.left,x);
        }
        else if(root.data<x){
            root.right=delNode(root.right,x);
        }
        else{
            // node with 0 child
            if(root.left==null && root.right==null) return null;
            
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            Node pred=root.left;
            while(pred.right!=null) pred=pred.right;
            root.left=delNode(root.left,pred.data);
            pred.left=root.left;
            pred.right=root.right;
            return pred;
        }
        return root;
    }
}