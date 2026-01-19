/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main
{
    static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    static void reversesort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		            
                }
            }
        }
        print(arr);
        //System.out.println();
    }
    static void findsum(int arr[],int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int a[]=new int[2];
        while(i<j){
            if(arr[i]+arr[j]==target){
                a[0]=arr[i];
                a[1]=arr[j];
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            
        }
    }
    
	public static void main(String[] args) {
		int arr[]={1,3,2,-2,0,7,3};
		print(arr);
		System.out.println();
		reversesort(arr);
		
		for(int i=0;i<arr.length-1;i++){
		    int swap=0;
		    for(int j=0;j<arr.length-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		            swap++;
		        }
		    }
		    if(swap==0) break;
		}
		System.out.println();
		print(arr);
	}
}