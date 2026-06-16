class Solution {
    void attach(TreeNode root , int val){
        if(root == null || root.val == val) return;
        if(root.val < val){
            if(root.right == null) root.right = new TreeNode(val);
            attach(root.right , val);
        } 
        else{ //root.val > val
            if(root.left == null) root.left = new TreeNode(val);
            attach(root.left , val);
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        attach(root , val);
        return root;
    }
}