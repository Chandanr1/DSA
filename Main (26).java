/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main
{   
    static int[] rotate(int arr1[],int k){
        int a=0;
        int arr2[]=new int[arr1.length];
        for(int i=0;i<arr2.length-k;i++){
            arr2[i]=arr1[k+i];
            a=i;
        }
        int b=0;
        for(int j=a+1;j<arr2.length;j++){
        arr2[j]=arr1[b];
        b++;
            
        }
        return arr2;
    }
    static void display(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5};
	    int arr2[]=rotate(arr,2);
		display(arr2);
		
	}
}