/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class BubbleSort
{
    static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    
	public static void main(String[] args) {
		int arr[]={1,3,2,-2,0,7,3};
		print(arr);
		for(int i=0;i<arr.length-1;i++){
		    boolean flag=true;
		    for(int j=0;j<arr.length-1;j++){
		        if(arr[j]>arr[j+1]){
		            flag=false;
		            break;
		        }
		    }
		    if(flag==true) break;
		    for(int j=0;j<arr.length-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            int temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		System.out.println();
		print(arr);
	}
}