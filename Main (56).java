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
    
    static void hcf(int a,int b){
        int x=0;
        if(a>b) x=b;
        else x=a;
        int co=0;
        for(int i=1;i<=x;i++){
            if(a%i==0 && b%i==0) co=i;
        }
        System.out.print(co);
    }
    
	public static void main(String[] args) {
		int n=5;
// 		int factorial=fact(n);
        hcf(16,16);
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
	public int uniquePaths(int m, int n) {
        if(m==1 || n==1) return 1;
        return uniquePaths(m-1,n)+ uniquePaths(m,n-1);
    }
}