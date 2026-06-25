/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}

public class TreeImplementation{
    public static void display(Node temp){
        if(temp==null) return;
        System.out.print(temp.val+" ");
        display(temp.left);
        display(temp.right);
        
        
    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1+ size(root.left) + size(root.right);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public static int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
    public static int Maximum(Node root){
        if(root==null) return 0;
        return Math.max(root.val,Math.max(Maximum(root.left),Maximum(root.right)));//change here
    }
    public static int level(Node root){
        if(root==null) return 1;
        return 1 + Math.max(level(root.left),level(root.right));
    }
    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void Inorder(Node root){
        if(root==null) return;
        
        preorder(root.left);
        System.out.print(root.val+" ");
        preorder(root.right);
    }
     public static void main (String[] args) {
       Node a= new Node(3);
       Node b= new Node(4);
       Node c= new Node(2);
       Node d= new Node(-1);
       Node e= new Node(1);
       Node f= new Node(6);
       Node g= new Node(9);
       a.left=b; a.right=c;
       b.left=d; b.right=e;
       c.left=f; c.right=g;
       //display(a);
       System.out.println();
       Inorder(a);
    }
}


