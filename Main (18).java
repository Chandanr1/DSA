/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{   
    static boolean occurence(int arr[]){
        boolean x = true;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    x=false;
                    break;
                }
            }
        }
        return x;
    }
    
	public static void main(String[] args) {
		int x=3;
		int arr[]={5,2,3,4};
		System.out.print(occurence(arr) );
	}
}