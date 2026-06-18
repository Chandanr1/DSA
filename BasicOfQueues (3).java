/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Queue;
import java.util.*;
public class BasicOfQueues
{
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10) ; q.add(20) ; q.add(30); q.add(40); q.add(50);
		int n=q.size();
		int peekAt=3;
		int clone=peekAt;
		while(peekAt>0){
		    q.add(q.remove());
		    peekAt--;
		}
		System.out.println(q.peek());
		
		int c=n-clone;
	    while(c>0){
	        q.add(q.remove());
	        c--;
	    }
		System.out.println();
		System.out.print(q);
	}
}