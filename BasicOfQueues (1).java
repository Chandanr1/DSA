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
		q.add(10) ; q.add(20) ; q.add(30);
		int a=q.size();
		while(a>0){
		    int b=q.remove();
		    System.out.print(b+" ");
		    a--;
		    q.add(b);
		}
		System.out.println();
		System.out.print(q);
	}
}