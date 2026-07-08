/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    public int minValue(Node root) {
        // code here
        
        if(root.left==null && root.right==null) return root.data;
        if(root.left==null && root.right!=null) return root.data;
        return minValue(root.left);
    }
}