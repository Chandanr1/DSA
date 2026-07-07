/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public static void helper(Node root,ArrayList<Node> ans){
        if(root==null) return ;
        ans.add(root);
        helper(root.left,ans);
        helper(root.right,ans);
    }
    public static void flatten(Node root) {
        // code here
        ArrayList<Node> ans = new ArrayList<>();
        helper(root,ans);
        for(int i=0;i<ans.size()-1;i++){
            Node a = ans.get(i);
            Node b = ans.get(i+1);
            a.right=b;
            a.left=null;
        }
        Node last = ans.get(ans.size()-1);
        last.left=null;
        last.right=null;
        root=ans.get(0);
    }