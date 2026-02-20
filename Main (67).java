/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Stack;
public class Main
{   public static void rec(Stack<Integer> st,int val){
    if(st.size()==0){
        st.push(val);
        return;
    } 
    int data=st.pop();
    rec(st,val);
    st.push(data);
   // return st;
}
	public static void main(String[] args) {
	Stack<Integer> st = new Stack<>();
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
	rec(st,50);
	System.out.print(st);
	}
}