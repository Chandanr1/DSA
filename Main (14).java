/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{   
    int find(int arr[],int target){
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    void array(){
        int arr[]={1,5,3,9,11};
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]) max=arr[i];
            else max=arr[i+1];
        }
        System.out.println(max);
    }
	public static void main(String[] args) {
		Main obj = new Main();
		int arr[] =  {1,2,3,4};
		System.out.print(obj.find(arr,4));
	}
}