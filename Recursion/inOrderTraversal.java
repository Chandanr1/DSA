/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr=root; 
        while(st.size()>0 || curr!=null){
            if(curr!=null){
            if(curr.left!=null){
                st.push(curr);
                curr=curr.left;
            }
            else{
                ans.add(curr.data);
                curr=curr.right;
            }
            }
            else{
                Node top=st.pop();
                ans.add(top.data);
                curr=top.right;
            }
        }
        return ans;
    }
}