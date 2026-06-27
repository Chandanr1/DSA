/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean helper(Node r1,Node r2){
        if(r1 == null && r2==null) return true;
        if(r1==null || r2==null) return false;
        
        if(r1.data==r2.data){
             return helper(r1.left,r2.right) && helper(r1.right,r2.left);
        }
        
        return false;
    }
    public boolean isSymmetric(Node root) {
        // code here
        return helper(root.left,root.right);
    }
}