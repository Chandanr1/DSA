/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
 class displayList{
    public static void display(Node a){
    Node x=a;
    while(x!=null){
        System.out.print(x.val+" ");
        x=x.next;
    }
    System.out.println();
}
   public static void disp(Node a){
       if(a==null) return;
       disp(a.next);
       System.out.print(a.val+" ");
       
   }
}
public class LinkedList
{
    public static void insertAtHead(int val,Node head){
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
        displayList y=new displayList();
        y.display(head);
    }
    
    public static void insertAtTail(int val,Node tail){
        Node temp=new Node(val);
        tail.next=temp;
        tail=temp;
    }
    public static void deleteAtHead(Node head){
        head=head.next;
    }
	public static void main(String[] args) {
		Node a = new Node(10); 
		Node b = new Node(20); 
		Node c = new Node(30); 
		Node d = new Node(40); 
		Node e = new Node(50); 
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		displayList y=new displayList();
	    y.display(a);
	    insertAtHead(60,a);
	    //y.display(a);
	}
}