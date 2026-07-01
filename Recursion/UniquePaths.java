/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class UniquePaths {
    public int numberOfPaths(int m, int n) {
        // code here
        if(m==1 || n==1) return 1;
        // if(m==1 && n!=1) return numberOfPaths(m,n-1);
        // if(m!=1 && n==1) return numberOfPaths(m-1,n);
        return numberOfPaths(m-1,n) + numberOfPaths(m,n-1);
    }
}