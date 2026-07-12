/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
  
    public int nodeSum(Node root, int l, int r) {
        
        if(root==null) return 0;
        if(root.data<l)  return nodeSum(root.right,l,r);
        else if(root.data>r)  return nodeSum(root.left,l,r);
        else{
            return root.data + nodeSum(root.left,l,r) + nodeSum(root.right,l,r);
        }
        
    }
}
