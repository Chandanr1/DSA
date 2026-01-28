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
// 		int factorial=fact(n);
        int po=power(2,n);
		System.out.print(po);
	}
	static int fact(int n){
	    if(n==1) return 1;
	    return n*fact(n-1);
	}
	static void print1(int n){
	    if(n==0) return;
	    System.out.println(n);
	    print1(n-1);
	    System.out.println(n);
	}
	static int power(int a ,int b){
	    if(b==1) return a;
	    int call=power(a,b/2);
	    if(b%2==0){
	        return call*call;
	    }
	    else{
	        return call*call*a;
	    }
	}
}