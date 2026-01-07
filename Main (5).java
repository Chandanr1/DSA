/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int star=1;
	    int gap=3;
	    for(int i=1;i<=4;i++){
	        //for(int j=1;j<=4;j++){
	            for(int k=1;k<=gap;k++){
	                System.out.print(" ");
	            }
	            for(int l=1;l<=star;l++){
	                System.out.print("*");
	            }
	            star++;
	            gap--;
	       // }
	        System.out.println();
	    }
	}
}