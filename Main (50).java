/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{  
    boolean isPalindrome(String s) {
        // code here
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		
		s.append("Chandan");
		System.out.println(s);
		int i=0;
		int j=s.length()-1;
		while(i<=j){
		    char temp1=s.charAt(i);
		    char temp2=s.charAt(j);
		    s.setCharAt(i,temp2);
		    s.setCharAt(j,temp1);
		    i++;
		    j--;
		}
		System.out.println(s);
	}
}