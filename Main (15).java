/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{   
    static int occurence(int arr[],int x){
        int repeat=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x) repeat++;
        }
        return repeat;
    }
    
	public static void main(String[] args) {
		int x=3;
		int arr[]={1,2,3,5,5,3,4};
		System.out.print(occurence(arr,x));
	}
}