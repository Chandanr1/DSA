/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{   
    static void print(int a,int n){
        if(a==n+1) return;
        System.out.println(a);
        print(a+1,n);
    }
    
	public static void main(String[] args) {
		int n=5;
		print1(n);
	}
	static void print1(int n){
	    if(n==0) return;
	    System.out.println(n);
	    print1(n-1);
	    System.out.println(n);
	}
}