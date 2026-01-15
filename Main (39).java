/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    static void add(int arr[][],int r1,int c1,int arr1[][],int r2,int c2){
        if(r1!=r2 || c2!=c1){
            System.out.println("Wrong input -  addition not possible");
            return;
        }
        int arr2[][]=new int [r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr2[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for(int i=0;i<arr2.length;i++){
		    for(int j=0;j<arr2[i].length;j++){
		        System.out.print(arr2[i][j]+ " ");
		    }
		    System.out.println();
		}
    }
    static void multiply(int arr[][],int r1,int c1,int arr1[][],int r2,int c2){
        if(c1!=r2){
            System.out.println("Wrong input -  multiplication not possible");
            return;
        }
        int arr2[][]=new int [r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<r2;k++){
                    arr2[i][j]+=arr[i][k]*arr1[k][j];
                }
            }
        }
        for(int i=0;i<arr2.length;i++){
		    for(int j=0;j<arr2[i].length;j++){
		        System.out.print(arr2[i][j]+ " ");
		    }
		    System.out.println();
		}
    }
    static void transpose(int arr[][]){
        int arr1[][]=new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr1[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<arr1.length;i++){
		    for(int j=0;j<arr1[i].length;j++){
		        System.out.print(arr1[i][j]+ " ");
		    }
		    System.out.println();
		}
    }
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6}};
		int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
		transpose(arr1);
		}
}