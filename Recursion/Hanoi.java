/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public static int count;
    public void hanoi(int n , char a , char b,char c){
        if(n==0 ) return;
        hanoi(n-1,a,c,b) ;// a to c via b;
        count++;
        hanoi(n-1,b,a,c); // b to c via a
    }
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        count = 0;
        hanoi(n,'A','B','C');
        return count;
    }
}