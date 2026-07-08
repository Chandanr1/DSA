/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public void helper(Node root,ArrayList<Integer> arr , ArrayList<ArrayList<Integer>> ans,int sum){
        
        arr.add(root.key);
        sum=sum-root.key;
        
        if(sum==0){
            ans.add(new ArrayList<>(arr));
            //return ;
        }
        //else if(sum<0) return ;
        //arr.add(root.key);
        if(root.left!=null) helper(root.left,arr,ans,sum);
        if(root.right!=null) helper(root.right,arr,ans,sum);
        arr.remove(arr.size()-1);
    }
    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        helper(root,arr,ans,sum);
        return ans;
    }
}