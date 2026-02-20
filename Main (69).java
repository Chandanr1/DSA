/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
//import java.util.Stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class Stack{
    Node head;
    int len;
    public void push(int val){
        
        Node temp=new Node(val);
        if(len==0){
            head=temp;
        }
        else{
            temp.next=head;
        head=temp;
        }
        len++;
    }
    public int pop() throws Exception{
        if(head==null){
            throw new Exception("Stack is empty");
            //return -1;
        }
        int b=head.val;
        head=head.next;
        len--;
        return b;
    }
    int peek(){
        if(head==null){
            System.out.print("Stack is empty");
            return -1;
        }
        return head.val;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class Main
{  
	public static void main(String[] args) throws Exception {
	Stack st=new Stack();
	st.pop();
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
	st.display();
	st.pop();
	st.display();
	}
}