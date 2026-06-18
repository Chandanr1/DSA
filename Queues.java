/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Queue;
import java.util.*;
public class Queues
{
    public static int findTheWinner(int n, int k) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<= n;i++){
            q.add(i);
        }
        int a=k;
        while(q.size()!=1){
            a=k;
            while(a>1){
                q.add(q.remove());
                a--;
            }
            q.remove();
           
        }
        return q.peek();
    }
    
	public static void main(String[] args) {
	System.out.print(findTheWinner(5,2));
	}
}