/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int gap=3;
	    int star=1;
	    
		for(int i=1;i<=4;i++){
		    int a=1;
		    for(int j=1;j<=gap;j++){
		        System.out.print(" ");
		        
		    }
		    for(int k=1;k<=star;k++){
		        System.out.print(a);
		        a++;
		        
		    }
		    gap--;
		    star+=2;
		   
		    System.out.println();
		}
	}
}