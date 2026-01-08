/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int gap=-1;
	    int star=5;
	    for(int i=1;i<=5;i++){
	        if(i==1){
	            for(int j=1;j<=9;j++){
	                System.out.print("*");
	            }
	        }
	        else{
	            for(int j=1;j<=star;j++){
	                System.out.print("*");
	            }
	            for(int k=1;k<=gap;k++){
	                System.out.print(" ");
	            }
	            for(int j=1;j<=star;j++){
	                System.out.print("*");
	            }
	        }
	        gap+=2;
	        star--;
	        System.out.println();
	    }
}
}