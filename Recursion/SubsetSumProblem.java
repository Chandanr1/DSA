/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {

    static void helper(int arr[],int sum,int idx,List<Integer> l){
        if(idx==arr.length){
            l.add(sum);
            return;
        }
        int a=arr[idx];
        helper(arr,sum+a,idx+1,l);
        helper(arr,sum,idx+1,l);
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        List<Integer> l = new ArrayList<>();
        helper(arr,0,0,l);
        Collections.sort(l);
        Set<Integer> optimizedSet = new HashSet<>(l);
        
        // O(1) Lookup time
        boolean isPresent = optimizedSet.contains(sum); 
        return isPresent;
    }
    }
