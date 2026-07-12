/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    public boolean search(Node root, int key) {
        // code here
        if(root==null) return false;
        if(root.data==key) return true;
        else if(key>root.data) return search(root.right,key);
        else return search(root.left,key);
    }
}