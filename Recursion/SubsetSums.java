/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public void helper(int arr[],int sum,int idx,ArrayList<Integer> l){
        int n=arr.length;
        if(idx==n){
            l.add(sum);
            return;
        }
        int a=arr[idx];
        helper(arr,sum+a,idx+1,l);
        helper(arr,sum,idx+1,l);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> l = new ArrayList<>();
        helper(arr,0,0,l);
        Collections.sort(l);
        return l;
    }
}