/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static void spiral(int arr[][],int n,int m){
        int a=n*m;
        int b=0;
        int toprow=0;
        int bottomrow=arr.length-1;
        int rightcol=arr.length-1;
        int leftcol=0;
        while(b!=a){
            for(int i=leftcol;i<=rightcol && b<a;i++){
                System.out.print(arr[toprow][i]+ " ");
                b++;
            }
            for(int j=toprow+1;j<bottomrow && b<a;j++){
                System.out.print(arr[j][rightcol]+" ");
                b++;
            }
            for(int k=rightcol;k>=leftcol && b<a;k--){
                System.out.print(arr[bottomrow][k]+" ");
                b++;
            }
            for(int l=bottomrow-1;l>toprow && b<a;l--){
                System.out.print(arr[l][leftcol]+" ");
                b++;
            }
            toprow++;
            rightcol--;
            bottomrow--;
            leftcol++;
            
        }
    }
    
    static int[][] spiralinsert(int n){
        int a=n*n;
        int b=0;
        int arr[][]=new int[n][n];
        int toprow=0;
        int bottomrow=arr.length-1;
        int rightcol=arr.length-1;
        int leftcol=0;
        int current=1;
        while(current<=n*n){
            for(int i=leftcol;i<=rightcol && current<=n*n;i++){
                arr[toprow][i]=current;
                current++;
                
            }
            for(int j=toprow+1;j<bottomrow && current<=n*n;j++){
                arr[j][rightcol]=current;
                current++;
               
            }
            for(int k=rightcol;k>=leftcol && current<=n*n;k--){
                arr[bottomrow][k]=current;
                current++;
                
            }
            for(int l=bottomrow-1;l>toprow && current<=n*n;l--){
                arr[l][leftcol]=current;
                current++;
                
            }
            toprow++;
            rightcol--;
            bottomrow--;
            leftcol++;
            
        }
    }
    
	public static void main(String[] args) {
		int arr1[][]=spiralinsert(3);
		spiral(arr1,3,3);
	}
}