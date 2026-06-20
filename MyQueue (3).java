/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class MyStack {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> helper=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
        // while(helper.size()>0){
        //     q.add(helper.remove());
        // }
    }
    
    public int pop() {
      return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return (q.size()==0);
    }
}
public class MyQueue{
    public static void main(String[] args){
        MyStack st=new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
    }
}
