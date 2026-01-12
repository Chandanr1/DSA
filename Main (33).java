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
    static void swap(int arr[],int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static int[] order(int arr[]){
        int arr1[]=new int[arr.length];
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                arr1[a]=arr[i];
                a++;
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                arr1[a]=arr[i];
                a++;
            }
        }
        return arr1;
    }
    static int[] square(int arr[]){
        int left=0;
        int right=arr.length-1;
        int arr1[]=new int[arr.length];
        int i=0;
        while(left<right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                arr1[i]=arr[left]*arr[left];
                i++;
                left++;
            }
            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                arr1[i]=arr[right]*arr[right];
                i++;
                right--;
            }
        }
        arr1[i]=arr[left]*arr[left];
        return arr1;
    }
    
    static void reverse(int arr[]){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp; 
            left++;
            right--;
        }
    }
    
	public static void main(String[] args) {
		int arr[]={-10,2,3,5,7};
		int arr2[]=square(arr);
		reverse(arr2);
		
		
		for(int i=0;i<arr2.length;i++){
		    System.out.print(arr2[i]+ " " );
		}
	}
}
