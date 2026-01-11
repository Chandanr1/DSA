/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main
{   
    static int pair(int arr1[],int target){
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]+arr1[j]==target){
                    sum++;
                }
            }
        }
        return sum;
    }
    
	public static void main(String[] args) {
		int x=0;
		int arr[]={1,2,3,4,0};
		System.out.print(pair(arr,x));
	}
}