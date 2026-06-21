/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> st =new Stack<>();
        int size=q.size()/2;
        for(int i=0;i<size;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }//
        for(int i=0;i<size;i++){
            st.push(q.remove());
        }//
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }
        int n=q.size();
        for(int i=0;i<n;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
    }
}


