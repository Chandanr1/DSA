/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Queue;
import java.util.*;
public class BasicOfQueues
{
	public static void display(Queue<Integer> q){
        System.out.println(q);
    }
    
    public static void insertAtIndex(Queue<Integer> q , int idx , int ele){
        int n=q.size();
		int clone=idx;
		while(idx>0){
		    q.add(q.remove());
		    idx--;
		}
		q.add(ele);
		
		int c=n-clone;
	    while(c>0){
	        q.add(q.remove());
	        c--;
	    }
	    display(q);
    }
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10) ; q.add(20) ; q.add(30); q.add(40); q.add(50);
		display(q);
		insertAtIndex(q,3,6);
	}
}
