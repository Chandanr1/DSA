/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;
public class Main
{ 
    static int[] freq(int arr[]){
        int fre[]=new int[100005];
        for(int i=0;i<arr.length;i++){
            fre[arr[i]]++;
        }
        return fre;
    }
    
	public static void main(String[] args) {
		int arr[]={1,4,400,300,1000,102};
		int q=5;
		Scanner sc = new Scanner(System.in);
		int frequency[]=freq(arr);
		while(q>0){
		    int x=sc.nextInt();
		    if(frequency[x]>0){
		        System.out.print("yes");
		       
		    }
		    else{
		        System.out.print("No");
		    }
		    q--;
		}
	}
}
