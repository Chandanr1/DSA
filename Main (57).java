/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static void rec(int arr[],int index){
        if(index==arr.length-1){
            System.out.print(arr[index]+" ");
            return;
        }
        rec(arr,index+1);
        System.out.print(arr[index]+" ");
    }
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		rec(arr,0);
	}
}