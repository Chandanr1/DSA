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
   
    public boolean isBST(Node root) {
       
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
         for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= arr.get(i - 1))
                return false;
        }

        return true;
    }
}