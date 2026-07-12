/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    public Node build(int pl,int ph,int il,int ih,int in[],int post[]){
        if(pl>ph) return null;
        Node root = new Node(post[ph]);
        int r=0;
        for(int i=il;i<=ih;i++){
            if(root.data==in[i]){
                r=i;
                break;
            }
        }
        int cnt=r-il;
        root.left=build(pl,pl+cnt-1,il,r-1,in,post);
        root.right=build(pl+cnt,ph-1,r+1,ih,in,post);
        return root;
    }
    public Node buildTree(int[] inorder, int[] postorder) {
        // code here
        int n=inorder.length;
        return build(0,n-1,0,n-1,inorder,postorder);
    }
}