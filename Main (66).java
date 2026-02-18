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
       
        if(head==null) {
            System.out.print("list is empty");
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }
    void display(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    void insertAtIndex(int idx,int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        } 
        if(idx<0 || idx>size){
            System.out.print("Incorrect index");
        }
        ListNode a = new ListNode(val);
        ListNode temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        a.prev=temp;
        a.next=temp.next;
        temp.next=a;
        a.next.prev=a;
        size++;
    }
}
public class Main
{
	public static void main(String[] args) {
		DLL list = new DLL();
		list.insertAtHead(10);
		list.insertAtHead(20);
		list.insertAtHead(30);
		list.insertAtHead(40);
		list.display();
		list.deleteAtHead();
		list.deleteAtTail();
		list.display();
		list.insertAtIndex(1,10);
		list.insertAtIndex(0,40);
		list.display();
	}
}