/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class MyQueue {
   Stack<Integer> st=new Stack<>();
   Stack<Integer> rt=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
      return st.peek()
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
        else return false;
    }
}