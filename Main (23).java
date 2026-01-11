/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
public class Main
{   
    static int unique(int arr1[]){
        for (int i=0;i<(arr1.length/2)+1;i++ ){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
                    arr1[i]=-1;
                    arr1[j]=-1;
                }
                
            }
        }
        Arrays.sort(arr1);
        
        return arr1[arr1.length-1];
    }
    
	public static void main(String[] args) {
		int x=12;
		int arr[]={1,2,3,4,2,3,1};
		System.out.print(unique(arr.clone()));
		
	}
}