/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}


class Solution {
    void leftBoundary(Node root,ArrayList<Integer> ans){
        if(root==null) return ;
        if(root.left==null && root.right==null) return;
        ans.add(root.data);
        if(root.left!=null) leftBoundary(root.left,ans);
        else leftBoundary(root.right,ans);
    }
    void leafBoundary(Node root,ArrayList<Integer> ans){
        if(root==null) return ;
        if(root.left==null && root.right==null){
            ans.add(root.data);
            return;
        }
       leafBoundary(root.left,ans);
       leafBoundary(root.right,ans);
    }
    void rightBoundary(Node root,ArrayList<Integer> ans){
        if(root==null) return ;
        if(root.left==null && root.right==null) return;
        
        if(root.right!=null) rightBoundary(root.right,ans);
        else rightBoundary(root.left,ans);
        ans.add(root.data);
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        if(root.left==null && root.right==null) {
            ans.add(root.data);
            return ans;
        }
        if(root.left==null) ans.add(root.data);
        if(root.left!=null) leftBoundary(root,ans);
        leafBoundary(root,ans);
        rightBoundary(root.right,ans);
        return ans;
    }
}