/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    public void inorder(Node root,ArrayList<Integer> arr){
        if(root==null) return ;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public int kthSmallest(Node root, int k) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        if(arr.size()<k) return -1; 
        return arr.get(k-1);
    }
}