/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    public Node LCA(Node root, Node n1, Node n2) {
       
        if(n1.data>root.data && n2.data>root.data) return LCA(root.right,n1,n2);
        else if(n1.data<root.data && n2.data<root.data) return LCA(root.left,n1,n2);
        else return root;
    }
}