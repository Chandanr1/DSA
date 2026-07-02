/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {

    public void gen(int n,int l,int r,String s,List<String> ans){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n){
            gen(n,l+1,r,s+"(",ans);
            
        }
        if(r<l) gen(n,l,r+1,s+")",ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        gen(n,0,0,"",ans);
        return ans;
    }
}