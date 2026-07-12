/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    public static Node build(int pl,int ph,int il,int ih , int in[],int pre[]){
        if(pl>ph) return null;
        Node root=new Node(pre[pl]);
        int r=0;
        for(int i=il;i<=ih;i++){
            if(root.data==in[i]){
                r=i;
                break;
            } 
        }
        int cnt=r-il;
        root.left = build(pl+1,pl+cnt,il,ih-1,in,pre);
        root.right = build(pl+cnt+1,ph,r+1,ih,in,pre);
        return root;
    }
    // Function that constructs BST from its preorder traversal.
    public Node preToBST(int pre[]) {
        // code here
        int in[]=Arrays.copyOf(pre,pre.length);
        Arrays.sort(in);
        int n=pre.length;
       return build(0,n-1,0,n-1,in,pre);
    }
}