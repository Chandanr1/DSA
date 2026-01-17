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
    
	public static void main(String[] args) {
		int arr[][]={ {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		spiral(arr,5,5);
	}
}