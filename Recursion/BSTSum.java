/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public static void inorder(Node root,ArrayList<Node> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
    public static void transformTree(Node root) {
        // code here
        ArrayList<Node> arr=new ArrayList<>();
        inorder(root,arr);
        int sum=0;
        for(int i=arr.size()-1;i>=0;i--){
            int temp=arr.get(i).data;
            arr.get(i).data=sum;
            sum+=temp;
        }
    }
}