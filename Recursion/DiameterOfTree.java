/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public static int max;
    public int diameter(Node root) {
        // code here
        max =0;
        level(root);
        return max;
    }
    public int level(Node root){
        if(root==null) return 0;
        int leftLevels = level(root.left);
        int rightLevels= level(root.right);
        int dia = leftLevels+rightLevels;
        max=Math.max(max,dia);
        return 1  + Math.max(leftLevels,rightLevels);
    }
}