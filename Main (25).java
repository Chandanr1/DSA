/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main
{   
    static void reverse(int arr1[]){
        for(int i=0;i<arr1.length/2;i++){
               
                int temp=arr1[i];
                arr1[i]=arr1[(arr1.length-1)-i];
                arr1[(arr1.length-1)-i]=temp;
            
        }
    }
    
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5};
		reverse(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
		
	}
}