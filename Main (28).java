/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;
public class Main
{ 
    static void sort(int arr[]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) count++;
        }
        for(int i=0;i<count;i++){
            arr[i]=0;
        }
        for(int i=count;i<arr.length;i++){
            arr[i]=1;
        }
    }
	public static void main(String[] args) {
		int arr[]={0,0,1,0,0,1,1,0,1};
		sort(arr);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
