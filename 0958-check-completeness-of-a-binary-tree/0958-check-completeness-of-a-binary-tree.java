class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
        while(!q.isEmpty()){
            TreeNode t = q.remove();
            if(t == null) flag = true;
            else{
                if(flag) return false; 
                q.add(t.left);
                q.add(t.right);
            }
        }
        return true;
    }
}