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
       display(a);
       System.out.println();
       System.out.print(size(a));
    }
}


