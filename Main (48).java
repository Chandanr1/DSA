/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
public class Main
{
    static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
    
    static void zeros(int arr[]){
        int arr1[]=new int[arr.length];
        int count=0;
        int b=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr1[b]=arr[i];
                b++;
            }
            else count++;
        }
        for(int i=b;i<arr1.length;i++){
            arr1[i]=0;
        }
        print(arr1);
    }
    
    static void zeroes(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
            if(arr[j]==0){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
            }
        }
        print(arr);
    }
    static void selectionSort(int arr[]){
        
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            int min=Integer.MAX_VALUE;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                   min=arr[j];
                   index=j;
                } 
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
        print(arr);
    }
    static void reverse(ArrayList<Integer> a ){
        int i=0;
        int j=a.size()-1;
        while(i<j){
            int temp=a.get(i);
            a.set(i,a.get(j));
            a.set(j,temp);
            i++;
            j--;
        }
        for(int k=0;k<a.size();k++){
		    System.out.print(a.get(k)+" ");
		}
    }
    static void insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int ele: arr) System.out.print(ele+" ");
    }
    
	public static void main(String[] args) {
		int arr[]={4,3,2,1,-2,0,1};
		insertionsort(arr);
	}
}