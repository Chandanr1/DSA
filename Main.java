/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int a=1;
	    int b=5;
		for(int i=1;i<=5;i++){
		    for(int j=1;j<=5;j++){
		        if(j==a || j==b){
		            System.out.print("*");
		        }
		        else{
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		    a++;
		    b--;
		}
	}
}