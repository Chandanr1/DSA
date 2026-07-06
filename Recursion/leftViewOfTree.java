/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public void helper(Node root, int level,ArrayList<Integer> ans){
        if(root==null) return ;
        if(level>=ans.size()){
            ans.add(root.data);
        }
        //else ans.set(level,root.data);
        helper(root.left,level+1,ans);
        helper(root.right,level+1,ans);
    }
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root,0,ans);
        return ans;
    }
}