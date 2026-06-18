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
	public static void removeAtIndex(Queue<Integer> q , int idx){
		int n=q.size();
		int removeAt=3;
		int clone=removeAt;
		while(removeAt>0){
		    q.add(q.remove());
		    removeAt--;
		}
		System.out.println(q.remove());
		int size=q.size();
		int c=size-clone;
	    while(c>0){
	        q.add(q.remove());
	        c--;
	    }
	}
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10) ; q.add(20) ; q.add(30); q.add(40); q.add(50);
		display(q);
		removeAtIndex(q,3);
		
	}
}
