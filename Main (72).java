// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class  Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
class Main {
    static int val=0;
    public static void main(String[] args) {
        Node a =new Node(3);
		Node b=new Node(4);
		Node c =new Node(2);
		Node d =new Node(-1);
		Node e =new Node(1);
		Node f =new Node(6);
		Node g =new Node(9);
		a.left=b;a.right=c;
		b.left=d;b.right=e;
		c.left=f;c.right=g;
		display(a);
		System.out.print(multiply(a));
	}
	public static int size(Node root){
	    if(root==null) return 0;
	    int lst=size(root.left);
	    int rst=size(root.right);
	    return 1+lst+rst;
	}
	public static int sum(Node root){
	    if(root==null) return 0;
	    
	    return root.val+sum(root.left)+sum(root.right);
	}
	public static int multiply(Node root){
	    if(root==null) return 1;
	    
	    return root.val*multiply(root.left)*multiply(root.right);
	}
	public static void display(Node root){
	    if(root==null) return;
	    //if(root==null) return ;
	    val++;
	    display(root.left);
	    display(root.right);
	    
	}
    }