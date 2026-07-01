/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Solution {
    public void helper(String ans,String s , int idx,List<String> l){
        if(idx==s.length()){
            l.add(ans);
            return;
        }
        char ch=s.charAt(idx);
        helper(ans+ch,s,idx+1,l);
        helper(ans,s,idx+1,l);
    }
    public List<String> powerSet(String s) {
        // Code here
        List<String> l = new ArrayList<>();
        helper("",s,0,l);
        Collections.sort(l);
        return l;
    }
}