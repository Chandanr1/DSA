/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main
{ 
    static int[] smallestAndLargestElement(int[] arr){
        int small=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int[] arr1={small,max};
        return arr1;
        
    }
    
	public static void main(String[] args) {
		int[] arr={1,2,3,0,4,5,1,10};
		int arr2[]=smallestAndLargestElement(arr);
		for(int i=0;i<arr2.length;i++){
		    System.out.print(arr2[i]);
		}
	}
}