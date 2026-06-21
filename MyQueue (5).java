/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> ans =new ArrayList<>();
        
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                q.add(i);
            }
        }
        
           for(int i=0;i<arr.length-k+1;i++){
              while(q.size()>0 && q.peek()<i) q.remove();
              if(q.size()>0 && q.peek()<=i+k-1) ans.add(arr[q.peek()]);
              else ans.add(0);
        }
        return ans;
}
}
public Class MyQueue{
    public static void main(String[] args){
        
    }
}


