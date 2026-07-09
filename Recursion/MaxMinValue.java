/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    static int min;
    static int max;
    public static void helper(Node root){
        if(root==null) return;
        min=Math.min(min,root.data);
        max=Math.max(max,root.data);
        helper(root.left);
        helper(root.right);
    }
    
    public static int findMax(Node root) {
        // code here
       max=Integer.MIN_VALUE;
        //min=Integer.MAX_VALUE;
       helper(root);
       return max;
    }

    public static int findMin(Node root) {
       // max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        helper(root);
        return min;
        // code here
    }
}