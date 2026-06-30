/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{   
    public static void display(int x,int n){
        if(x>n) return ;
        System.out.print(x+" ");
        display(x+1,n);
        if(x!=5) System.out.print(x+" ");
    }
	public static void main(String[] args) {
		display(1,5);
	}
}