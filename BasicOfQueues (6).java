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
    
    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(k>q.size()) return q;
        Stack<Integer> st=new Stack<>();
        int clone=k;
        while(k>0){
            st.push(q.remove());
            k--;
            }
        while(st.size()>0){
            q.add(st.pop());
        }
        int c=q.size()-clone;
        while(c>0){
            q.add(q.remove());
            c--;
        }
        return q;
    }
    
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(10) ; q.add(20) ; q.add(30); q.add(40); q.add(50);
		display(q);
		display(reverseFirstK(q,3));
	}
}