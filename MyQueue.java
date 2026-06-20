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
        st.push(x);
    }
    
    public int pop() {
        while(st.size()>1){
            rt.push(st.pop());
        }
        int x=st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
        return x;
    }
    
    public int peek() {
      while(st.size()>1){
            rt.push(st.pop());
        }
        int x=st.peek();
        while(rt.size()>0){
            st.push(rt.pop());
        } 
        return x; 
    }
    
    public boolean empty() {
        if(st.size()==0) return true;
        else return false;
    }
}