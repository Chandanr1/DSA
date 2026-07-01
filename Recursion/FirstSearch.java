/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class FirstSearch {
    public int helper(int arr[],int k,int low,int high){
        if(low>high) return -1;
        int mid=low + (high-low)/2;
        if(arr[mid]==k){
            if(mid-1>=0){
            if(arr[mid-1]==arr[mid]) return helper(arr,k,low,mid-1);
            }
            return mid;
        } 
        else if(arr[mid]>k) return helper(arr,k,low,mid-1);
        else return helper(arr,k,mid+1,high);
    }
    public int firstSearch(int[] arr, int k) {
        // Code Here
        return helper(arr,k,0,arr.length-1);
    }
}