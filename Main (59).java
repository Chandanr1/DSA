/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static boolean rev(int arr[],int index , int target){
        if(arr[index]==target){
            return true;
        } 
        else if(index==arr.length) return false;
        return rev(arr,index+1,target);
        //return a;
    }
    
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5};
	    //boolean var1=false;
		System.out.print(rev(arr,0,2));
	}
}