class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data  =d;
        left = right = null;
    }
}


class Solution {
    
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Node> q =new LinkedList<>();
        boolean leftoright=true;
        q.add(root);
        while(q.size()>0){
            int size=q.size();
            ArrayList<Integer> level =new ArrayList<>();
            for(int i=0;i<size;i++){
                Node front=q.remove();
                level.add(front.data);
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
            if(!leftoright){
                Collections.reverse(level);
            }
            ans.addAll(level);
            leftoright=!leftoright;
        }
        return ans;
    }
    
}