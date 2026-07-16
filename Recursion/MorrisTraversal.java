/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public static void dfs(Node root,ArrayList<Integer> ans){
        if(root==null) return;
        
        dfs(root.left,ans);
        ans.add(root.data);
        dfs(root.right,ans);
        //return ans;
    }
    
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Node curr=root;
        while(curr!=null){
            if(curr.left!=null){
                Node pred=curr.left;
                while(pred.right!=null && pred.right!=curr) pred=pred.right;
                if(pred.right==null){
                    pred.right=curr;
                    curr=curr.left;
                }
                else{
                    pred.right=null;
                    ans.add(curr.data);
                    curr=curr.right;
                }
            }
            else{
                ans.add(curr.data);
                curr=curr.right;
            }
        }
        return ans;
    }
}