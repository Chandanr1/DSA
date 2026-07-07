/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public static void flatten(Node root) {
        // code here
        if(root==null) return;
        Node lst = root.left;
        Node rst=root.right;
        root.left=null;
        root.right=null;
        flatten(lst);
        flatten(rst);
        root.right=lst;
        Node last=root;
        while(last.right!=null) last=last.right;
        last.right=rst;
    }