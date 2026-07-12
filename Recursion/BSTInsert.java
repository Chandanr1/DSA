/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    public void helper(Node root,int key){
        if(root==null) return;
        if(root.data==key) return;
        
        if(root.data>key){
            if(root.left==null) {
                root.left=new Node(key);
                
            }
            else helper(root.left,key);
        } 
        else  {
            if(root.right==null) {
                root.right=new Node(key);
                
            }
            else helper(root.right,key);
        }
        
    }
    public Node insert(Node root, int key) {
       
        helper(root,key);
        return root;
    }
}