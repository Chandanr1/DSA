/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    int getCount(Node root, int l, int r) {
        
        if(root==null) return 0;
        if(root.data<l)  return getCount(root.right,l,r);
        else if(root.data>r)  return getCount(root.left,l,r);
        else{
            return 1 + getCount(root.left,l,r) + getCount(root.right,l,r);
        }
    }
}
