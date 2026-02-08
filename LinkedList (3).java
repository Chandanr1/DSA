/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Node{
    int val;
    Node next;
}
 class displayList{
    public static void display(Node a){
    Node x=a;
    while(x!=null){
        System.out.print(x.val+" ");
        x=x.next;
    }
}
   public static void disp(Node a){
       if(a==null) return;
       disp(a.next);
       System.out.print(a.val+" ");
       
   }
}
public class LinkedList
{
	public static void main(String[] args) {
		Node a = new Node(); a.val=10;
		Node b = new Node(); b.val=20;
		Node c = new Node(); c.val=30;
		Node d = new Node(); d.val=40;
		Node e = new Node(); e.val=50;
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		displayList y=new displayList();
	    y.disp(a);
	}
}