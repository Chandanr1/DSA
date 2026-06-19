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
        this.next=null;
    }
}
 class Myqueue{
    Node head ;
    Node tail ;
    int size;
    
    int peek(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return head.val;
    }
    int remove(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        int front=head.val;
        head=head.next;
        size--;
        return front;
    }
    void add(int val){
        Node temp = new Node(val);
        if(tail==null) head=tail=temp;
        else{
        tail.next=temp;
        tail=temp;
        size++;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Queue_implementation
{
	public static void main(String[] args) {
		Myqueue q = new Myqueue();
		q.add(10); q.add(20) ; q.add(30) ; q.add(40);
		q.display();
		System.out.println(q.peek());
		System.out.println(q.remove());
		q.display();
		
	}
	
}