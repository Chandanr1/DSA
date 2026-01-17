/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static int sum(int arr[][],int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    
    static void sum1(int arr[][],int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        
        for(int i=0;i<=l2;i++){
            sum+=arr[i][r2] - arr[i][r1-1];
        }
        System.out.print(sum);
    }
    
	public static void main(String[] args) {
		int arr[][]={{1,1,1,1},{1,1,1,1},{1,1,1,1}};
		sum1(arr,0,1,2,3);
	}
}