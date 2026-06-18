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
		int insertAt=3;
		int clone=insertAt;
		while(insertAt>0){
		    q.add(q.remove());
		    insertAt--;
		}
		q.add(60);
		
		int c=n-clone;
	    while(c>0){
	        q.add(q.remove());
	        c--;
	    }
		System.out.println();
		System.out.print(q);
	}
}