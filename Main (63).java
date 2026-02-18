/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val=val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head==null) {
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head==null) {
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(size==1) head=temp=null;
        if(head==null) {
            System.out.print("list is empty");
        }
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }
    void deleteAtTail(){
       if(size==1) head=tail=null;
        if(head==null) {
            System.out.print("list is empty");
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
