/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class GCD {
    public static int gcd(int a, int b) {
        // code here
        if(a==0) return b;
        return gcd(b%a,a);
    }
}